/**
 */
package simplepdl;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Human</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link simplepdl.Human#getEmail <em>Email</em>}</li>
 *   <li>{@link simplepdl.Human#getRole <em>Role</em>}</li>
 *   <li>{@link simplepdl.Human#getAsignedTasks <em>Asigned Tasks</em>}</li>
 * </ul>
 *
 * @see simplepdl.SimplepdlPackage#getHuman()
 * @model
 * @generated
 */
public interface Human extends Resource {
	/**
	 * Returns the value of the '<em><b>Email</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Email</em>' attribute.
	 * @see #setEmail(String)
	 * @see simplepdl.SimplepdlPackage#getHuman_Email()
	 * @model
	 * @generated
	 */
	String getEmail();

	/**
	 * Sets the value of the '{@link simplepdl.Human#getEmail <em>Email</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Email</em>' attribute.
	 * @see #getEmail()
	 * @generated
	 */
	void setEmail(String value);

	/**
	 * Returns the value of the '<em><b>Role</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Role</em>' attribute.
	 * @see #setRole(String)
	 * @see simplepdl.SimplepdlPackage#getHuman_Role()
	 * @model
	 * @generated
	 */
	String getRole();

	/**
	 * Sets the value of the '{@link simplepdl.Human#getRole <em>Role</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Role</em>' attribute.
	 * @see #getRole()
	 * @generated
	 */
	void setRole(String value);

	/**
	 * Returns the value of the '<em><b>Asigned Tasks</b></em>' reference list.
	 * The list contents are of type {@link simplepdl.WorkDefinition}.
	 * It is bidirectional and its opposite is '{@link simplepdl.WorkDefinition#getAssignedTo <em>Assigned To</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Asigned Tasks</em>' reference list.
	 * @see simplepdl.SimplepdlPackage#getHuman_AsignedTasks()
	 * @see simplepdl.WorkDefinition#getAssignedTo
	 * @model opposite="assignedTo"
	 * @generated
	 */
	EList<WorkDefinition> getAsignedTasks();

} // Human
