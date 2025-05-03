/**
 */
package simplepdl.metamodel.simplepdl.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

import simplepdl.metamodel.simplepdl.Human;
import simplepdl.metamodel.simplepdl.RequiredMaterial;
import simplepdl.metamodel.simplepdl.SimplepdlPackage;
import simplepdl.metamodel.simplepdl.WorkDefinition;
import simplepdl.metamodel.simplepdl.WorkSequence;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Work Definition</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link simplepdl.metamodel.simplepdl.impl.WorkDefinitionImpl#getLinksToSuccessor <em>Links To Successor</em>}</li>
 *   <li>{@link simplepdl.metamodel.simplepdl.impl.WorkDefinitionImpl#getLinksToPredecessor <em>Links To Predecessor</em>}</li>
 *   <li>{@link simplepdl.metamodel.simplepdl.impl.WorkDefinitionImpl#getAssignedTo <em>Assigned To</em>}</li>
 *   <li>{@link simplepdl.metamodel.simplepdl.impl.WorkDefinitionImpl#getRequiredmaterial <em>Requiredmaterial</em>}</li>
 * </ul>
 *
 * @generated
 */
public class WorkDefinitionImpl extends ProcessElementImpl implements WorkDefinition {
	/**
	 * The cached value of the '{@link #getLinksToSuccessor() <em>Links To Successor</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLinksToSuccessor()
	 * @generated
	 * @ordered
	 */
	protected EList<WorkSequence> linksToSuccessor;

	/**
	 * The cached value of the '{@link #getLinksToPredecessor() <em>Links To Predecessor</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLinksToPredecessor()
	 * @generated
	 * @ordered
	 */
	protected EList<WorkSequence> linksToPredecessor;

	/**
	 * The cached value of the '{@link #getAssignedTo() <em>Assigned To</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAssignedTo()
	 * @generated
	 * @ordered
	 */
	protected EList<Human> assignedTo;

	/**
	 * The cached value of the '{@link #getRequiredmaterial() <em>Requiredmaterial</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRequiredmaterial()
	 * @generated
	 * @ordered
	 */
	protected EList<RequiredMaterial> requiredmaterial;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected WorkDefinitionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SimplepdlPackage.Literals.WORK_DEFINITION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<WorkSequence> getLinksToSuccessor() {
		if (linksToSuccessor == null) {
			linksToSuccessor = new EObjectWithInverseResolvingEList<WorkSequence>(WorkSequence.class, this,
					SimplepdlPackage.WORK_DEFINITION__LINKS_TO_SUCCESSOR, SimplepdlPackage.WORK_SEQUENCE__PREDECESSOR);
		}
		return linksToSuccessor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<WorkSequence> getLinksToPredecessor() {
		if (linksToPredecessor == null) {
			linksToPredecessor = new EObjectWithInverseResolvingEList<WorkSequence>(WorkSequence.class, this,
					SimplepdlPackage.WORK_DEFINITION__LINKS_TO_PREDECESSOR, SimplepdlPackage.WORK_SEQUENCE__SUCCESSOR);
		}
		return linksToPredecessor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Human> getAssignedTo() {
		if (assignedTo == null) {
			assignedTo = new EObjectWithInverseResolvingEList.ManyInverse<Human>(Human.class, this,
					SimplepdlPackage.WORK_DEFINITION__ASSIGNED_TO, SimplepdlPackage.HUMAN__ASIGNED_TASKS);
		}
		return assignedTo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<RequiredMaterial> getRequiredmaterial() {
		if (requiredmaterial == null) {
			requiredmaterial = new EObjectContainmentEList<RequiredMaterial>(RequiredMaterial.class, this,
					SimplepdlPackage.WORK_DEFINITION__REQUIREDMATERIAL);
		}
		return requiredmaterial;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case SimplepdlPackage.WORK_DEFINITION__LINKS_TO_SUCCESSOR:
			return ((InternalEList<InternalEObject>) (InternalEList<?>) getLinksToSuccessor()).basicAdd(otherEnd, msgs);
		case SimplepdlPackage.WORK_DEFINITION__LINKS_TO_PREDECESSOR:
			return ((InternalEList<InternalEObject>) (InternalEList<?>) getLinksToPredecessor()).basicAdd(otherEnd,
					msgs);
		case SimplepdlPackage.WORK_DEFINITION__ASSIGNED_TO:
			return ((InternalEList<InternalEObject>) (InternalEList<?>) getAssignedTo()).basicAdd(otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case SimplepdlPackage.WORK_DEFINITION__LINKS_TO_SUCCESSOR:
			return ((InternalEList<?>) getLinksToSuccessor()).basicRemove(otherEnd, msgs);
		case SimplepdlPackage.WORK_DEFINITION__LINKS_TO_PREDECESSOR:
			return ((InternalEList<?>) getLinksToPredecessor()).basicRemove(otherEnd, msgs);
		case SimplepdlPackage.WORK_DEFINITION__ASSIGNED_TO:
			return ((InternalEList<?>) getAssignedTo()).basicRemove(otherEnd, msgs);
		case SimplepdlPackage.WORK_DEFINITION__REQUIREDMATERIAL:
			return ((InternalEList<?>) getRequiredmaterial()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case SimplepdlPackage.WORK_DEFINITION__LINKS_TO_SUCCESSOR:
			return getLinksToSuccessor();
		case SimplepdlPackage.WORK_DEFINITION__LINKS_TO_PREDECESSOR:
			return getLinksToPredecessor();
		case SimplepdlPackage.WORK_DEFINITION__ASSIGNED_TO:
			return getAssignedTo();
		case SimplepdlPackage.WORK_DEFINITION__REQUIREDMATERIAL:
			return getRequiredmaterial();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
		case SimplepdlPackage.WORK_DEFINITION__LINKS_TO_SUCCESSOR:
			getLinksToSuccessor().clear();
			getLinksToSuccessor().addAll((Collection<? extends WorkSequence>) newValue);
			return;
		case SimplepdlPackage.WORK_DEFINITION__LINKS_TO_PREDECESSOR:
			getLinksToPredecessor().clear();
			getLinksToPredecessor().addAll((Collection<? extends WorkSequence>) newValue);
			return;
		case SimplepdlPackage.WORK_DEFINITION__ASSIGNED_TO:
			getAssignedTo().clear();
			getAssignedTo().addAll((Collection<? extends Human>) newValue);
			return;
		case SimplepdlPackage.WORK_DEFINITION__REQUIREDMATERIAL:
			getRequiredmaterial().clear();
			getRequiredmaterial().addAll((Collection<? extends RequiredMaterial>) newValue);
			return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
		case SimplepdlPackage.WORK_DEFINITION__LINKS_TO_SUCCESSOR:
			getLinksToSuccessor().clear();
			return;
		case SimplepdlPackage.WORK_DEFINITION__LINKS_TO_PREDECESSOR:
			getLinksToPredecessor().clear();
			return;
		case SimplepdlPackage.WORK_DEFINITION__ASSIGNED_TO:
			getAssignedTo().clear();
			return;
		case SimplepdlPackage.WORK_DEFINITION__REQUIREDMATERIAL:
			getRequiredmaterial().clear();
			return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
		case SimplepdlPackage.WORK_DEFINITION__LINKS_TO_SUCCESSOR:
			return linksToSuccessor != null && !linksToSuccessor.isEmpty();
		case SimplepdlPackage.WORK_DEFINITION__LINKS_TO_PREDECESSOR:
			return linksToPredecessor != null && !linksToPredecessor.isEmpty();
		case SimplepdlPackage.WORK_DEFINITION__ASSIGNED_TO:
			return assignedTo != null && !assignedTo.isEmpty();
		case SimplepdlPackage.WORK_DEFINITION__REQUIREDMATERIAL:
			return requiredmaterial != null && !requiredmaterial.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //WorkDefinitionImpl
