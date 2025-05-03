/**
 */
package simplepdl.metamodel.simplepdl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Required Material</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link simplepdl.metamodel.simplepdl.RequiredMaterial#getMaterial <em>Material</em>}</li>
 *   <li>{@link simplepdl.metamodel.simplepdl.RequiredMaterial#getQuantity <em>Quantity</em>}</li>
 * </ul>
 *
 * @see simplepdl.metamodel.simplepdl.SimplepdlPackage#getRequiredMaterial()
 * @model
 * @generated
 */
public interface RequiredMaterial extends EObject {
	/**
	 * Returns the value of the '<em><b>Material</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Material</em>' reference.
	 * @see #setMaterial(Material)
	 * @see simplepdl.metamodel.simplepdl.SimplepdlPackage#getRequiredMaterial_Material()
	 * @model
	 * @generated
	 */
	Material getMaterial();

	/**
	 * Sets the value of the '{@link simplepdl.metamodel.simplepdl.RequiredMaterial#getMaterial <em>Material</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Material</em>' reference.
	 * @see #getMaterial()
	 * @generated
	 */
	void setMaterial(Material value);

	/**
	 * Returns the value of the '<em><b>Quantity</b></em>' attribute.
	 * The default value is <code>"1"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Quantity</em>' attribute.
	 * @see #setQuantity(int)
	 * @see simplepdl.metamodel.simplepdl.SimplepdlPackage#getRequiredMaterial_Quantity()
	 * @model default="1" required="true"
	 * @generated
	 */
	int getQuantity();

	/**
	 * Sets the value of the '{@link simplepdl.metamodel.simplepdl.RequiredMaterial#getQuantity <em>Quantity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Quantity</em>' attribute.
	 * @see #getQuantity()
	 * @generated
	 */
	void setQuantity(int value);

} // RequiredMaterial
