/**
 */
package simplepdl.metamodel.simplepdl;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Work Definition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link simplepdl.metamodel.simplepdl.WorkDefinition#getLinksToSuccessor <em>Links To Successor</em>}</li>
 *   <li>{@link simplepdl.metamodel.simplepdl.WorkDefinition#getLinksToPredecessor <em>Links To Predecessor</em>}</li>
 *   <li>{@link simplepdl.metamodel.simplepdl.WorkDefinition#getAssignedTo <em>Assigned To</em>}</li>
 *   <li>{@link simplepdl.metamodel.simplepdl.WorkDefinition#getRequiredmaterial <em>Requiredmaterial</em>}</li>
 * </ul>
 *
 * @see simplepdl.metamodel.simplepdl.SimplepdlPackage#getWorkDefinition()
 * @model
 * @generated
 */
public interface WorkDefinition extends ProcessElement {
	/**
	 * Returns the value of the '<em><b>Links To Successor</b></em>' reference list.
	 * The list contents are of type {@link simplepdl.metamodel.simplepdl.WorkSequence}.
	 * It is bidirectional and its opposite is '{@link simplepdl.metamodel.simplepdl.WorkSequence#getPredecessor <em>Predecessor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Links To Successor</em>' reference list.
	 * @see simplepdl.metamodel.simplepdl.SimplepdlPackage#getWorkDefinition_LinksToSuccessor()
	 * @see simplepdl.metamodel.simplepdl.WorkSequence#getPredecessor
	 * @model opposite="predecessor"
	 * @generated
	 */
	EList<WorkSequence> getLinksToSuccessor();

	/**
	 * Returns the value of the '<em><b>Links To Predecessor</b></em>' reference list.
	 * The list contents are of type {@link simplepdl.metamodel.simplepdl.WorkSequence}.
	 * It is bidirectional and its opposite is '{@link simplepdl.metamodel.simplepdl.WorkSequence#getSuccessor <em>Successor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Links To Predecessor</em>' reference list.
	 * @see simplepdl.metamodel.simplepdl.SimplepdlPackage#getWorkDefinition_LinksToPredecessor()
	 * @see simplepdl.metamodel.simplepdl.WorkSequence#getSuccessor
	 * @model opposite="successor"
	 * @generated
	 */
	EList<WorkSequence> getLinksToPredecessor();

	/**
	 * Returns the value of the '<em><b>Assigned To</b></em>' reference list.
	 * The list contents are of type {@link simplepdl.metamodel.simplepdl.Human}.
	 * It is bidirectional and its opposite is '{@link simplepdl.metamodel.simplepdl.Human#getAsignedTasks <em>Asigned Tasks</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Assigned To</em>' reference list.
	 * @see simplepdl.metamodel.simplepdl.SimplepdlPackage#getWorkDefinition_AssignedTo()
	 * @see simplepdl.metamodel.simplepdl.Human#getAsignedTasks
	 * @model opposite="asignedTasks" required="true"
	 * @generated
	 */
	EList<Human> getAssignedTo();

	/**
	 * Returns the value of the '<em><b>Requiredmaterial</b></em>' containment reference list.
	 * The list contents are of type {@link simplepdl.metamodel.simplepdl.RequiredMaterial}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Requiredmaterial</em>' containment reference list.
	 * @see simplepdl.metamodel.simplepdl.SimplepdlPackage#getWorkDefinition_Requiredmaterial()
	 * @model containment="true"
	 * @generated
	 */
	EList<RequiredMaterial> getRequiredmaterial();

} // WorkDefinition
