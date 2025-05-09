# SimplePDL: A Simple Process Definition Language

[![GitHub](https://img.shields.io/badge/GitHub-simplepdl--language-blue?logo=github)](https://github.com/tomdieu/simplepdl-language)

Clone repo

```sh
git clone https://github.com/tomdieu/simplepdl-language
```

This repository contains the implementation of SimplePDL, a simple language for defining processes, developed using the Eclipse Modeling Framework (EMF), Xtext, Acceleo, and OCL.

## Overview

SimplePDL allows users to define processes consisting of Work Definitions and Work Sequences using:

1. **Ecore Metamodel:** Defines the abstract syntax (concepts like Process, WorkDefinition, WorkSequence).
2. **OCL:** Adds constraints to the metamodel.
3. **Xtext:** Provides a textual syntax for defining process instances.
4. **Acceleo:** Generates documentation (HTML) and visualizations (DOT graphs) from process instances.
5. **Sirius (Optional):** Provides a graphical editor (Note: This part was not fully implemented in this specific setup).

## Project Structure

The workspace is organized into several Eclipse plugins:

* `simplepdl.metamodel`: Contains the Ecore model (`simplepdl.ecore`), GenModel (`simplepdl.genmodel`), and OCL constraints (`simplepdl.ocl`).
* `simplepdl.metamodel.edit`: Generated EMF Edit plugin.
* `simplepdl.metamodel.editor`: Generated EMF Editor plugin.
* `simplepdl.xtext`: Contains the Xtext grammar (`SimplePDL.xtext`) and workflow (`GenerateSimplePDL.mwe2`).
* `simplepdl.xtext.ide`: Xtext IDE integration.
* `simplepdl.xtext.ui`: Xtext UI components.
* `simplepdl.xtext.tests`: Xtext testing infrastructure.
* `simplepdl.acceleo`: Contains the Acceleo templates (`.mtl`) for code generation.
* `simplepdl`: A simple Java project containing example instances (`.xmi`).
* `images`: Contains screenshots and diagrams related to the project.

## Cloning the Repository

To get a local copy of the project, clone the repository using Git:

```bash
git clone https://github.com/tomdieu/simplepdl-language.git
cd simplepdl-language
```

Then, import the projects into your Eclipse Modeling Tools workspace.

## Getting Started

### Prerequisites

* Eclipse Modeling Tools.
* Install Acceleo, Xtext, and OCL from the Eclipse Marketplace if not already included.
* **Java Development Kit (JDK):** The majority of the projects were developed and tested using **JavaSE 17**.

### 1. Metamodel Definition (Ecore)

The core structure of the SimplePDL language is defined in `simplepdl.metamodel/model/simplepdl.ecore`.

* **Creating the Project:** An Ecore modeling project (`simplepdl.metamodel`) is created to hold the metamodel.
* **Metamodel:** The concepts (Classes like `Process`, `WorkDefinition`, `WorkSequence`) and their relationships (References, Attributes) are defined graphically or textually.

![SimplePDL Metamodel](simplepdl.metamodel/simplepdl.jpg)
*(Image: simplepdl.metamodel/simplepdl.jpg)*

### 2. Defining Constraints (OCL)

Object Constraint Language (OCL) is used to add validation rules to the metamodel that cannot be expressed by the Ecore structure alone.

* **Creating the OCL File:**
    1. Right-click on the `simplepdl.ecore` file in the `simplepdl.metamodel` project.
    2. Select `New` > `Other...`.
    3. Choose `OCL` > `OCL File (Complete OCL Document)`.
    4. Name the file (e.g., `simplepdl.ocl`).
* **Writing Constraints:** Define invariants and constraints within the `.ocl` file, referencing the Ecore elements.

### 3.a

## Process

Example 1: Process "Make Coffee Process" (M0 Level)

    The process Make Coffee Process has:

        Four tasks (WorkDefinition): Gather Items, Prepare Machine, Brew Coffee, Pour Coffee.

        Three sequences (WorkSequence): Seq Gather to Prepare, Seq Prepare to Brew, Seq Brew to Pour.

        One human resource (Human): Barista (role: 'Coffee Maker').

        Five material resources (Material): Filter Coffee Machine (unit: 'device'), Paper Coffee Filter (unit: 'piece'), Ground Coffee Beans (unit: 'gram'), Tap Water (unit: 'ml'), Ceramic Mug (unit: 'item').

    Each task (Gather Items, Prepare Machine, Brew Coffee, Pour Coffee) is assigned to the human resource Barista.

    The task Prepare Machine requires:

        1 Paper Coffee Filter.

        15 Ground Coffee Beans.

        300 Tap Water.

    The task Brew Coffee requires 1 Filter Coffee Machine.

    The task Pour Coffee requires 1 Ceramic Mug.

    The sequences define order constraints:

        Prepare Machine can only start after Gather Items finishes (via Seq Gather to Prepare, type: finishToStart).

        Brew Coffee can only start after Prepare Machine finishes (via Seq Prepare to Brew, type: finishToStart).

        Pour Coffee can only start after Brew Coffee finishes (via Seq Brew to Pour, type: finishToStart).
	    
Example 2 : Process "Write Master Thesis" (M0 Level)

    The process Write Master Thesis has:

        Seven tasks (WorkDefinition): Define Topic & Proposal, Conduct Research & Literature Review, Write First Draft (Chapters), Supervisor Review & Revision Cycle, Format Thesis, Committee Review & Defense, Final Revisions & Submission.

        Six sequences (WorkSequence): Seq_Proposal_Research, Seq_Research_Draft, Seq_Draft_Review, Seq_Review_Format, Seq_Format_Defense, Seq_Defense_Submit.

        Three primary human resources (Human): Student Researcher (role: 'Author'), Primary Supervisor (role: 'Advisor'), Committee Member (role: 'Examiner'). (Note: More committee members could be added).

        Five key material resources (Material): Research Databases (unit: 'subscription access'), Citation Manager Software (unit: 'license'), Word Processor/LaTeX (unit: 'license'), University Thesis Template (unit: 'document'), Thesis Submission Portal (unit: 'web service access'). (Note: More specific databases, software, or lab equipment could be added).

    Each task is primarily assigned to a human resource (though others might contribute):

        Define Topic & Proposal is assigned to Student Researcher (with supervisor input).

        Conduct Research & Literature Review is assigned to Student Researcher.

        Write First Draft (Chapters) is assigned to Student Researcher.

        Supervisor Review & Revision Cycle is assigned to Primary Supervisor (review part) and Student Researcher (revision part). (Metamodel Note: Your current metamodel assigns a task to only one person (assignedTo lowerBound=1). For review cycles, you might model this as separate "Review" and "Revise" tasks or acknowledge this limitation in M0 description). Let's assign the cycle's primary responsibility to the Primary Supervisor for review initiation.

        Format Thesis is assigned to Student Researcher.

        Committee Review & Defense is assigned to Committee Member (review/examining) and Student Researcher (defending). Assigning primary responsibility to Committee Member.

        Final Revisions & Submission is assigned to Student Researcher.

    Certain tasks require material resources:

        Conduct Research & Literature Review requires Research Databases and Citation Manager Software.

        Write First Draft (Chapters) requires Word Processor/LaTeX and Citation Manager Software.

        Supervisor Review & Revision Cycle requires Word Processor/LaTeX (for revisions).

        Format Thesis requires Word Processor/LaTeX and University Thesis Template.

        Final Revisions & Submission requires Word Processor/LaTeX and Thesis Submission Portal.

    The sequences define the primary order constraints (all assumed type: finishToStart):

        Conduct Research & Literature Review can only start after Define Topic & Proposal finishes.

        Write First Draft (Chapters) can only start after Conduct Research & Literature Review finishes.

        Supervisor Review & Revision Cycle can only start after Write First Draft (Chapters) finishes. (This represents the first major review cycle).

        Format Thesis can only start after the Supervisor Review & Revision Cycle finishes (implying supervisor approval of the draft).

        Committee Review & Defense can only start after Format Thesis finishes (thesis submitted to committee).

        Final Revisions & Submission can only start after Committee Review & Defense finishes (and assuming successful defense with revisions).

### 3.b example of process langage SimplePDL en utilisant l’éditeur arborescent de Eclipse EMF
- Tree view for Make Coffee
  ![Make coffee xmi instance](images/text%20representation%20for%20prepare%20breakfast%20written%20in%20simplepdl%20language%20define%20with%20xtext.png)
- Tree view for write master thesis
- ![Write master thesis](images/WriteMasterThesis%20instance%20tree%20diagram.png)

### 5.b. Textual Syntax (Xtext)

Xtext is used to define a Domain-Specific Language (DSL) for creating SimplePDL process instances textually.

* **Creating the Xtext Project:**
    1. Create a new Xtext project (e.g., `simplepdl.xtext`).
    ![Create Xtext Project](images/create%20xtext%20project.png)
    For our project we used:
        * Project name : simplepdl.xtext
        * Language name : simplepdl.xtext.SimplePDL
        * Langage extension : simplepdl
    2. Define the grammar in the `.xtext` file, mapping keywords and structure to the Ecore metamodel elements.
    3. We decide out simplepdl text representation language should look like
        """xtext
        grammar simplepdl.xtext.SimplePDL with org.eclipse.xtext.common.Terminals

        generate simplePDL "http://www.xtext.simplepdl/SimplePDL"

        Model:
            processes+=Process*;


        Process:
            'process' name=ID '{'
                ('description' description=STRING)?
                (workdefinitions+=WorkDefinition)*
                (worksequences+=WorkSequence)*
                (resources+=Resource)*
            '}'
        ;

        WorkDefinition:
            'workdefinition' name=ID '{'
                ('description' description=STRING)?
                'assignedTo' assignedTo+=[Human|ID] (',' assignedTo+=[Human|ID])*
                ('requiredMaterial' requiredMaterials+=RequiredMaterial)*
                ('linksToPredecessor' predecessor+=[WorkDefinition|ID] (',' predecessor+=[WorkDefinition|ID])*
                '[' 'type' '=' predType=WorkSequenceType ']' )?
                ('linksToSuccessor' successor+=[WorkDefinition|ID] (',' successor+=[WorkDefinition|ID])*
                '[' 'type' '=' succType=WorkSequenceType ']' )?
            '}'
        ;

        WorkSequence:
            'worksequence' name=ID '{'
                'predecessor' predecessor=[WorkDefinition|ID]
                'successor' successor=[WorkDefinition|ID]
                'type' type=WorkSequenceType
            '}'
        ;

        RequiredMaterial:
            '[' 'material' material=[Material|ID]
            ('quantity' '=' quantity=INT)?
            ']'
        ;

        Resource:
            Human | Material
        ;

        Human:
            'human' name=ID '{'
                'email' email=STRING
                'role' role=STRING
            '}'
        ;


        Material:
            'material' name=ID '{'
                'unit' unit=STRING
            '}'
        ;

        enum WorkSequenceType:
            startToStart   = 'startToStart' |
            finishToStart  = 'finishToStart' |
            startToFinish  = 'startToFinish' |
            finishToFinish = 'finishToFinish'
        ;
        """
* **Generating Xtext Artifacts:**
    1. Open the `.xtext` file (e.g., `SimplePDL.xtext`).
    2. Right-click in the editor and select `Run As` > `Generate Xtext Artifacts`.
    3. Open the workflow file (e.g., `GenerateSimplePDL.mwe2`).
    4. Right-click in the editor and select `Run As` > `MWE2 Workflow`. This generates the parser, serializer, editor support, etc.
* **Testing the Language:**
    1. Right-click on the `simplepdl.xtext` project.
    2. Select `Run As` > `Eclipse Application`. A new Eclipse instance will launch.
    3. In the new Eclipse instance, create a `Java Project`.
    4. Inside the `src` folder of the Java project, create a new file with the extension defined during Xtext project creation (e.g., `.simplepdl`).
    5. Write your process definition using the defined textual syntax. You should see syntax highlighting and auto-completion.
    6. You can use this example simplepdl code

        ```simplepdl
        process MakeCoffee {
            description ""  // no description provided

            // Work Definitions
            workdefinition GatherItems {
                assignedTo Ivantom
            }

            workdefinition PrepareMachine {
                assignedTo Ivantom
                requiredMaterial [ material GroundCoffeeBeans quantity=15 ]
                requiredMaterial [ material TapWater quantity=300 ]
                requiredMaterial [ material PaperCoffeeFilter quantity=1 ]
            }

            workdefinition BrewCoffee {
                assignedTo Ivantom
                requiredMaterial [ material FilterCoffeeMachine quantity=1 ]
            }

            workdefinition PourCoffee {
                assignedTo Ivantom
                requiredMaterial [ material CeramicMug quantity=1 ]
            }

            // Work Sequences
            worksequence Gather_to_Prepare {
                predecessor GatherItems
                successor PrepareMachine
                type finishToStart
            }

            worksequence Prepare_to_Brew {
                predecessor PrepareMachine
                successor BrewCoffee
                type finishToStart
            }

            worksequence Brew_to_Pour {
                predecessor BrewCoffee
                successor PourCoffee
                type finishToStart
            }
            // Resources: Human
            human Ivantom {
                email   ""           // not specified
                role    "Coffee Maker"
            }

            // Resources: Materials
            material FilterCoffeeMachine {
                unit "device"
            }

            material PaperCoffeeFilter {
                unit "piece"
            }

            material GroundCoffeeBeans {
                unit "gram"
            }

            material TapWater {
                unit "ml"
            }

            material CeramicMug {
                unit "item"
            }
        }
        ```

**Examples:**

![Prepare Breakfast Example](images/text%20representation%20for%20prepare%20breakfast%20written%20in%20simplepdl%20language%20define%20with%20xtext.png)
*(Image: Textual representation for preparing breakfast)*

![Make Coffee Example](images/text%20representation%20to%20makecoffee%20written%20in%20simplepdl%20language%20define%20with%20xtext.png)
*(Image: Textual representation for making coffee)*

![Write Master Thesis Example](images/text%20representation%20for%20writing%20a%20master%20thesis%20with%20simplepdl%20language%20define%20with%20xtext.png)
*(Image: Textual representation for writing a master thesis)*

### 4. Code Generation (Acceleo)

Acceleo is used for Model-to-Text (M2T) transformations, generating files from SimplePDL models (instances).

* **Creating the Acceleo Project:**
    1. Create a new Acceleo project (e.g., `simplepdl.acceleo`).
    ![Create Acceleo Project](images/create-acceleo-project.png)
    *(Image: images/create-acceleo-project.png)*
    2. Add the metamodel URI: Click the `+` button for Metamodel URIs and add `http://www.example.org/simplepdl`.
    ![Configure Acceleo Metamodel](images/configure%20acceleo.png)
    *(Image: images/configure acceleo.png)*
    3. Check the options to generate a file and a main template. This creates an `.mtl` file.
* **Writing Transformations:** Define templates in the `.mtl` file to query the model and generate text (e.g., HTML documentation, DOT graph descriptions).
* **Acceleo COde transformation** 
    
    ```mtl
    [comment encoding = UTF-8 /]
    [module generate('http://www.example.org/simplepdl')]


    [template public generateElement(aProcess : Process)]
    [comment @main/]
    [file (aProcess.name + '.html', false, 'UTF-8')]
    <!DOCTYPE html>
    <html>
    <head>
        <meta charset="UTF-8">
        <title>[aProcess.name/] Process Details</title>
        <style>
            body { font-family: Arial, sans-serif; margin: 20px; }
            h1, h2, h3 { color: #333366; }
            .process { border: 1px solid #ddd; padding: 15px; margin-bottom: 20px; }
            .work-definition { background-color: #f9f9f9; padding: 10px; margin: 10px 0; border-left: 5px solid #4CAF50; }
            .work-sequence { background-color: #f5f5f5; padding: 5px; margin: 5px 0; border-left: 5px solid #2196F3; }
            .resource { background-color: #fff8e1; padding: 8px; margin: 8px 0; border-left: 5px solid #FF9800; }
            .material { background-color: #e8f5e9; padding: 8px; margin: 8px 0; border-left: 5px solid #8BC34A; }
            table { border-collapse: collapse; width: 100%; margin: 10px 0; }
            th, td { border: 1px solid #ddd; padding: 8px; text-align: left; }
            th { background-color: #f2f2f2; }
        </style>
    </head>
    <body>
        <h1>[aProcess.name/] Process</h1>
        [if (aProcess.description <> null)]
        <p><strong>Description:</strong> [aProcess.description/]</p>
        [/if]
        
        <div class="process">
            <h2>Work Definitions</h2>
            <table>
        <tr>
            <th>Name</th>
            <th>Description</th>
            <th>Assigned To</th>
            <th>Required Materials</th>
            <th>Dependencies</th>
        </tr>
        [for (element : ProcessElement | aProcess.processElements)]
            [if (element.oclIsTypeOf(WorkDefinition))]
                [let wd : WorkDefinition = element.oclAsType(WorkDefinition)]
                <tr>
                    <td>[wd.name/]</td>
                    <td>
                        [if (wd.description <> null)]
                            [wd.description/]
                        [/if]
                    </td>
                    <td>
                        [if (not wd.assignedTo->isEmpty())]
                            [for (human : Human | wd.assignedTo) separator(', ')]
                                [human.name/] ([human.role/])
                            [/for]
                        [/if]
                    </td>
                    <td>
                        [if (not wd.requiredmaterial->isEmpty())]
                            <ul>
                            [for (req : RequiredMaterial | wd.requiredmaterial)]
                                <li>[req.quantity/] [req.material.unit/] of [req.material.name/]</li>
                            [/for]
                            </ul>
                        [/if]
                    </td>
                    <td>
                        [if (not wd.linksToSuccessor->isEmpty())]
                            <ul>
                            [for (seq : WorkSequence | wd.linksToSuccessor)]
                                <li>When this task 
                                    [if (seq.linkType = WorkSequenceType::finishToStart or seq.linkType = WorkSequenceType::finishToFInish)]finishes[else]starts[/if], 
                                    task "[seq.successor.name/]" can 
                                    [if (seq.linkType = WorkSequenceType::finishToStart or seq.linkType = WorkSequenceType::startToStart)]start[else]finish[/if]
                                </li>
                            [/for]
                            </ul>
                        [/if]
                    </td>
                </tr>
                [/let]
            [/if]
        [/for]
    </table>
            
            <h2>Work Sequences</h2>
            <table>
        <tr>
            <th>Name</th>
            <th>Predecessor</th>
            <th>Successor</th>
            <th>Condition</th>
        </tr>
        [for (element : ProcessElement | aProcess.processElements)]
            [if (element.oclIsTypeOf(WorkSequence))]
                [let ws : WorkSequence = element.oclAsType(WorkSequence)]
                <tr>
                    <td>[ws.name/]</td>
                    <td>[ws.predecessor.name/]</td>
                    <td>[ws.successor.name/]</td>
                    <td>
                        [if (ws.linkType = WorkSequenceType::finishToStart)]
                            Finish to Start
                        [elseif (ws.linkType = WorkSequenceType::startToStart)]
                            Start to Start
                        [elseif (ws.linkType = WorkSequenceType::startToFinish)]
                            Start to Finish
                        [elseif (ws.linkType = WorkSequenceType::finishToFInish)]
                            Finish to Finish
                        [/if]
                    </td>
                </tr>
                [/let]
            [/if]
        [/for]
    </table>
            
            <h2>Resources</h2>
            <h3>Human Resources</h3>
            <table>
                <tr>
                    <th>Name</th>
                    <th>Role</th>
                    <th>Email</th>
                    <th>Assigned Tasks</th>
                </tr>
                [for (resource : Resource | aProcess.resources)]
                    [if (resource.oclIsTypeOf(Human))]
                        [let human : Human = resource.oclAsType(Human)]
                        <tr>
                            <td>[human.name/]</td>
                            <td>[human.role/]</td>
                            <td>[human.email/]</td>
                            <td>
                                [for (task : WorkDefinition | human.asignedTasks) separator(', ')]
                                    [task.name/]
                                [/for]
                            </td>
                        </tr>
                        [/let]
                    [/if]
                [/for]
            </table>
            
            <h3>Material Resources</h3>
            <table>
                <tr>
                    <th>Name</th>
                    <th>Unit</th>
                    <th>Used In</th>
                </tr>
                [for (resource : Resource | aProcess.resources)]
                    [if (resource.oclIsTypeOf(Material))]
                        [let material : Material = resource.oclAsType(Material)]
                        <tr>
                            <td>[material.name/]</td>
                            <td>[material.unit/]</td>
                            <td>
                                [for (wd : WorkDefinition | aProcess.processElements->select(e | e.oclIsTypeOf(WorkDefinition)))]
                                    [for (req : RequiredMaterial | wd.oclAsType(WorkDefinition).requiredmaterial)]
                                        [if (req.material = material)]
                                            [wd.name/] ([req.quantity/]),
                                        [/if]
                                    [/for]
                                [/for]
                            </td>
                        </tr>
                        [/let]
                    [/if]
                [/for]
            </table>
        </div>


    </body>
    </html>
    [/file]

    [file (aProcess.name.concat('.dot'), false, 'UTF-8')]
    digraph "[aProcess.name.replaceAll(' ', '_')/]" {
        [for (element : ProcessElement | aProcess.processElements)]
            [if (element.oclIsTypeOf(WorkDefinition))]
                "[element.name.replaceAll(' ', '_')/]";
            [/if]
        [/for]

        [for (element : ProcessElement | aProcess.processElements)]
            [if (element.oclIsTypeOf(WorkSequence))]
                "[element.oclAsType(WorkSequence).predecessor.name.replaceAll(' ', '_')/]" -> "[element.oclAsType(WorkSequence).successor.name.replaceAll(' ', '_')/]";
            [/if]
        [/for]
    }
    [/file]
    [/template]

    ```

* **Running Transformations:**
    1. Right-click on the main `.mtl` file.
    2. Select `Run As` > `Run Configurations...`.
    3. Create a new configuration under `Acceleo Application`.
    ![Configure Acceleo Run Configuration](images/Configure%20the%20run%20configuration%20to%20run%20acceleo.png.png)
    *(Image: images/Configure the run configuration to run acceleo.png.png)*
    4. **Model:** Select the input model instance file (e.g., `simplepdl/instances/MakeCoffee.xmi`).
    5. **Target:** Select the output folder (e.g., `simplepdl.acceleo/output`).
    6. Click `Run`.

**Example Generated Outputs:**

* **DOT Files:** Textual representation of graphs (can be visualized using Graphviz).
    ![Make Coffee DOT Output](images/makecoffe%20dot%20representation%20generated%20by%20acceleo.png)
    *(Image: Generated DOT for Make Coffee process)*
    ![Write Master Thesis DOT Output](images/WriteMasterThesis%20dot%20diagram%20generate%20by%20acceleo.png)
    *(Image: Generated DOT for Write Master Thesis process)*
* **HTML Files:** Documentation generated from the process models.
    ![Make Coffee HTML Output](images/make%20coffee%20process%20html%20generated%20by%20acceleo.png)
    *(Image: Generated HTML for Make Coffee process)*
    ![Write Master Thesis HTML Output](images/write%20master%20thesis%20process%20html%20generated%20by%20acceleo.png)
    *(Image: Generated HTML for Write Master Thesis process)*

### 5.a. Graphical Editor (Sirius - Optional Steps)

Sirius allows the creation of graphical modeling workbenches. (Note: User indicated issues with this part).

* **Generating EMF Edit/Editor:** Before using Sirius effectively, you typically generate the basic tree-based editor from the Ecore model:
    1. Open the `simplepdl.genmodel` file.
    2. Right-click on the root element.
    3. Select `Generate Model Code`, `Generate Edit Code`, and `Generate Editor Code`. This populates the `.edit` and `.editor` plugins.
* **Creating Sirius Specification:**
    1. Create a `Viewpoint Specification Project`.
    2. Define viewpoints, representations (diagrams, tables), and tools by referencing the `simplepdl.ecore` metamodel. This involves configuring the appearance and behavior of graphical elements corresponding to metamodel concepts. The specification is typically stored in an `.odesign` file.

## Example Instances

Example process models (`.xmi` format, compatible with the Ecore metamodel) can be found in the `simplepdl/instances/` directory:

* `PrepareBreakfast.xmi`
* `WriteMasterThesis.xmi`
* (Potentially others like `MakeCoffee.xmi` if used for Acceleo generation)

These instances can be opened with the generated EMF editor or used as input for Acceleo transformations.