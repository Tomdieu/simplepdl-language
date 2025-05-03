/**
 */
package simplepdl.metamodel.simplepdl.impl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import simplepdl.metamodel.simplepdl.Human;
import simplepdl.metamodel.simplepdl.Material;
import simplepdl.metamodel.simplepdl.ProcessElement;
import simplepdl.metamodel.simplepdl.RequiredMaterial;
import simplepdl.metamodel.simplepdl.Resource;
import simplepdl.metamodel.simplepdl.SimplepdlFactory;
import simplepdl.metamodel.simplepdl.SimplepdlPackage;
import simplepdl.metamodel.simplepdl.WorkDefinition;
import simplepdl.metamodel.simplepdl.WorkSequence;
import simplepdl.metamodel.simplepdl.WorkSequenceType;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class SimplepdlPackageImpl extends EPackageImpl implements SimplepdlPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass processEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass processElementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass workDefinitionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass workSequenceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass resourceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass humanEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass materialEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass requiredMaterialEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum workSequenceTypeEEnum = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see simplepdl.metamodel.simplepdl.SimplepdlPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private SimplepdlPackageImpl() {
		super(eNS_URI, SimplepdlFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 *
	 * <p>This method is used to initialize {@link SimplepdlPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static SimplepdlPackage init() {
		if (isInited)
			return (SimplepdlPackage) EPackage.Registry.INSTANCE.getEPackage(SimplepdlPackage.eNS_URI);

		// Obtain or create and register package
		Object registeredSimplepdlPackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		SimplepdlPackageImpl theSimplepdlPackage = registeredSimplepdlPackage instanceof SimplepdlPackageImpl
				? (SimplepdlPackageImpl) registeredSimplepdlPackage
				: new SimplepdlPackageImpl();

		isInited = true;

		// Create package meta-data objects
		theSimplepdlPackage.createPackageContents();

		// Initialize created meta-data
		theSimplepdlPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theSimplepdlPackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(SimplepdlPackage.eNS_URI, theSimplepdlPackage);
		return theSimplepdlPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getProcess() {
		return processEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getProcess_Name() {
		return (EAttribute) processEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getProcess_ProcessElements() {
		return (EReference) processEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getProcess_Description() {
		return (EAttribute) processEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getProcess_Resources() {
		return (EReference) processEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getProcessElement() {
		return processElementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getProcessElement_Name() {
		return (EAttribute) processElementEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getProcessElement_Description() {
		return (EAttribute) processElementEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getWorkDefinition() {
		return workDefinitionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getWorkDefinition_LinksToSuccessor() {
		return (EReference) workDefinitionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getWorkDefinition_LinksToPredecessor() {
		return (EReference) workDefinitionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getWorkDefinition_AssignedTo() {
		return (EReference) workDefinitionEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getWorkDefinition_Requiredmaterial() {
		return (EReference) workDefinitionEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getWorkSequence() {
		return workSequenceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getWorkSequence_LinkType() {
		return (EAttribute) workSequenceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getWorkSequence_Predecessor() {
		return (EReference) workSequenceEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getWorkSequence_Successor() {
		return (EReference) workSequenceEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getResource() {
		return resourceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getResource_Name() {
		return (EAttribute) resourceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getHuman() {
		return humanEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getHuman_Email() {
		return (EAttribute) humanEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getHuman_Role() {
		return (EAttribute) humanEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getHuman_AsignedTasks() {
		return (EReference) humanEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getMaterial() {
		return materialEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getMaterial_Unit() {
		return (EAttribute) materialEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getRequiredMaterial() {
		return requiredMaterialEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getRequiredMaterial_Material() {
		return (EReference) requiredMaterialEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getRequiredMaterial_Quantity() {
		return (EAttribute) requiredMaterialEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getWorkSequenceType() {
		return workSequenceTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SimplepdlFactory getSimplepdlFactory() {
		return (SimplepdlFactory) getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated)
			return;
		isCreated = true;

		// Create classes and their features
		processEClass = createEClass(PROCESS);
		createEAttribute(processEClass, PROCESS__NAME);
		createEReference(processEClass, PROCESS__PROCESS_ELEMENTS);
		createEAttribute(processEClass, PROCESS__DESCRIPTION);
		createEReference(processEClass, PROCESS__RESOURCES);

		processElementEClass = createEClass(PROCESS_ELEMENT);
		createEAttribute(processElementEClass, PROCESS_ELEMENT__NAME);
		createEAttribute(processElementEClass, PROCESS_ELEMENT__DESCRIPTION);

		workDefinitionEClass = createEClass(WORK_DEFINITION);
		createEReference(workDefinitionEClass, WORK_DEFINITION__LINKS_TO_SUCCESSOR);
		createEReference(workDefinitionEClass, WORK_DEFINITION__LINKS_TO_PREDECESSOR);
		createEReference(workDefinitionEClass, WORK_DEFINITION__ASSIGNED_TO);
		createEReference(workDefinitionEClass, WORK_DEFINITION__REQUIREDMATERIAL);

		workSequenceEClass = createEClass(WORK_SEQUENCE);
		createEAttribute(workSequenceEClass, WORK_SEQUENCE__LINK_TYPE);
		createEReference(workSequenceEClass, WORK_SEQUENCE__PREDECESSOR);
		createEReference(workSequenceEClass, WORK_SEQUENCE__SUCCESSOR);

		resourceEClass = createEClass(RESOURCE);
		createEAttribute(resourceEClass, RESOURCE__NAME);

		humanEClass = createEClass(HUMAN);
		createEAttribute(humanEClass, HUMAN__EMAIL);
		createEAttribute(humanEClass, HUMAN__ROLE);
		createEReference(humanEClass, HUMAN__ASIGNED_TASKS);

		materialEClass = createEClass(MATERIAL);
		createEAttribute(materialEClass, MATERIAL__UNIT);

		requiredMaterialEClass = createEClass(REQUIRED_MATERIAL);
		createEReference(requiredMaterialEClass, REQUIRED_MATERIAL__MATERIAL);
		createEAttribute(requiredMaterialEClass, REQUIRED_MATERIAL__QUANTITY);

		// Create enums
		workSequenceTypeEEnum = createEEnum(WORK_SEQUENCE_TYPE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized)
			return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		workDefinitionEClass.getESuperTypes().add(this.getProcessElement());
		workSequenceEClass.getESuperTypes().add(this.getProcessElement());
		humanEClass.getESuperTypes().add(this.getResource());
		materialEClass.getESuperTypes().add(this.getResource());

		// Initialize classes, features, and operations; add parameters
		initEClass(processEClass, simplepdl.metamodel.simplepdl.Process.class, "Process", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getProcess_Name(), ecorePackage.getEString(), "name", null, 0, 1,
				simplepdl.metamodel.simplepdl.Process.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE,
				!IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getProcess_ProcessElements(), this.getProcessElement(), null, "processElements", null, 0, -1,
				simplepdl.metamodel.simplepdl.Process.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE,
				!IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getProcess_Description(), ecorePackage.getEString(), "description", null, 0, 1,
				simplepdl.metamodel.simplepdl.Process.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE,
				!IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getProcess_Resources(), this.getResource(), null, "resources", null, 0, -1,
				simplepdl.metamodel.simplepdl.Process.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE,
				!IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(processElementEClass, ProcessElement.class, "ProcessElement", IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getProcessElement_Name(), ecorePackage.getEString(), "name", null, 0, 1, ProcessElement.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getProcessElement_Description(), ecorePackage.getEString(), "description", null, 0, 1,
				ProcessElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);

		initEClass(workDefinitionEClass, WorkDefinition.class, "WorkDefinition", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getWorkDefinition_LinksToSuccessor(), this.getWorkSequence(), this.getWorkSequence_Predecessor(),
				"linksToSuccessor", null, 0, -1, WorkDefinition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
				!IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getWorkDefinition_LinksToPredecessor(), this.getWorkSequence(), this.getWorkSequence_Successor(),
				"linksToPredecessor", null, 0, -1, WorkDefinition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
				!IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getWorkDefinition_AssignedTo(), this.getHuman(), this.getHuman_AsignedTasks(), "assignedTo",
				null, 1, -1, WorkDefinition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE,
				IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getWorkDefinition_Requiredmaterial(), this.getRequiredMaterial(), null, "requiredmaterial", null,
				0, -1, WorkDefinition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE,
				!IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(workSequenceEClass, WorkSequence.class, "WorkSequence", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getWorkSequence_LinkType(), this.getWorkSequenceType(), "linkType", null, 1, 1,
				WorkSequence.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEReference(getWorkSequence_Predecessor(), this.getWorkDefinition(),
				this.getWorkDefinition_LinksToSuccessor(), "predecessor", null, 1, 1, WorkSequence.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);
		initEReference(getWorkSequence_Successor(), this.getWorkDefinition(),
				this.getWorkDefinition_LinksToPredecessor(), "successor", null, 1, 1, WorkSequence.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);

		initEClass(resourceEClass, Resource.class, "Resource", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getResource_Name(), ecorePackage.getEString(), "name", null, 1, 1, Resource.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(humanEClass, Human.class, "Human", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getHuman_Email(), ecorePackage.getEString(), "email", null, 0, 1, Human.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getHuman_Role(), ecorePackage.getEString(), "role", null, 0, 1, Human.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getHuman_AsignedTasks(), this.getWorkDefinition(), this.getWorkDefinition_AssignedTo(),
				"asignedTasks", null, 0, -1, Human.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE,
				IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(materialEClass, Material.class, "Material", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getMaterial_Unit(), ecorePackage.getEString(), "unit", null, 0, 1, Material.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(requiredMaterialEClass, RequiredMaterial.class, "RequiredMaterial", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getRequiredMaterial_Material(), this.getMaterial(), null, "material", null, 0, 1,
				RequiredMaterial.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRequiredMaterial_Quantity(), ecorePackage.getEInt(), "quantity", "1", 1, 1,
				RequiredMaterial.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);

		// Initialize enums and add enum literals
		initEEnum(workSequenceTypeEEnum, WorkSequenceType.class, "WorkSequenceType");
		addEEnumLiteral(workSequenceTypeEEnum, WorkSequenceType.START_TO_START);
		addEEnumLiteral(workSequenceTypeEEnum, WorkSequenceType.FINISH_TO_START);
		addEEnumLiteral(workSequenceTypeEEnum, WorkSequenceType.START_TO_FINISH);
		addEEnumLiteral(workSequenceTypeEEnum, WorkSequenceType.FINISH_TO_FINISH);

		// Create resource
		createResource(eNS_URI);
	}

} //SimplepdlPackageImpl
