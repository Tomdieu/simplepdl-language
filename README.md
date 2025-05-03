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

* Eclipse Modeling Tools (Neon or later recommended).
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

### 3. Textual Syntax (Xtext)

Xtext is used to define a Domain-Specific Language (DSL) for creating SimplePDL process instances textually.

* **Creating the Xtext Project:**
    1. Create a new Xtext project (e.g., `simplepdl.xtext`).
    ![Create Xtext Project](images/create%20xtext%20project.png)
    *(Image: images/create xtext project.png)*
    2. Define the grammar in the `.xtext` file, mapping keywords and structure to the Ecore metamodel elements.
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

### 5. Graphical Editor (Sirius - Optional Steps)

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