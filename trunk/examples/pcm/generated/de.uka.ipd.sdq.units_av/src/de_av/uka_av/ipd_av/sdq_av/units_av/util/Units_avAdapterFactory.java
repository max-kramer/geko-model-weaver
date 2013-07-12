/**
 */
package de_av.uka_av.ipd_av.sdq_av.units_av.util;

import de_av.uka_av.ipd_av.sdq_av.units_av.*;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see de_av.uka_av.ipd_av.sdq_av.units_av.Units_avPackage
 * @generated
 */
public class Units_avAdapterFactory extends AdapterFactoryImpl {
   /**
    * The cached model package.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   protected static Units_avPackage modelPackage;

   /**
    * Creates an instance of the adapter factory.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public Units_avAdapterFactory() {
      if (modelPackage == null) {
         modelPackage = Units_avPackage.eINSTANCE;
      }
   }

   /**
    * Returns whether this factory is applicable for the type of the object.
    * <!-- begin-user-doc -->
    * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
    * <!-- end-user-doc -->
    * @return whether this factory is applicable for the type of the object.
    * @generated
    */
   @Override
   public boolean isFactoryForType(Object object) {
      if (object == modelPackage) {
         return true;
      }
      if (object instanceof EObject) {
         return ((EObject)object).eClass().getEPackage() == modelPackage;
      }
      return false;
   }

   /**
    * The switch that delegates to the <code>createXXX</code> methods.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   protected Units_avSwitch<Adapter> modelSwitch =
      new Units_avSwitch<Adapter>() {
         @Override
         public Adapter caseUnitCarryingElement(UnitCarryingElement object) {
            return createUnitCarryingElementAdapter();
         }
         @Override
         public Adapter caseUnit(Unit object) {
            return createUnitAdapter();
         }
         @Override
         public Adapter caseBaseUnit(BaseUnit object) {
            return createBaseUnitAdapter();
         }
         @Override
         public Adapter caseUnitRepository(UnitRepository object) {
            return createUnitRepositoryAdapter();
         }
         @Override
         public Adapter caseUnitMultiplication(UnitMultiplication object) {
            return createUnitMultiplicationAdapter();
         }
         @Override
         public Adapter caseUnitPower(UnitPower object) {
            return createUnitPowerAdapter();
         }
         @Override
         public Adapter caseUnitLiteral(UnitLiteral object) {
            return createUnitLiteralAdapter();
         }
         @Override
         public Adapter caseAdvice(Advice object) {
            return createAdviceAdapter();
         }
         @Override
         public Adapter caseGlobalScope(GlobalScope object) {
            return createGlobalScopeAdapter();
         }
         @Override
         public Adapter casePerJoinPointScope(PerJoinPointScope object) {
            return createPerJoinPointScopeAdapter();
         }
         @Override
         public Adapter defaultCase(EObject object) {
            return createEObjectAdapter();
         }
      };

   /**
    * Creates an adapter for the <code>target</code>.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @param target the object to adapt.
    * @return the adapter for the <code>target</code>.
    * @generated
    */
   @Override
   public Adapter createAdapter(Notifier target) {
      return modelSwitch.doSwitch((EObject)target);
   }


   /**
    * Creates a new adapter for an object of class '{@link de_av.uka_av.ipd_av.sdq_av.units_av.UnitCarryingElement <em>Unit Carrying Element</em>}'.
    * <!-- begin-user-doc -->
    * This default implementation returns null so that we can easily ignore cases;
    * it's useful to ignore a case when inheritance will catch all the cases anyway.
    * <!-- end-user-doc -->
    * @return the new adapter.
    * @see de_av.uka_av.ipd_av.sdq_av.units_av.UnitCarryingElement
    * @generated
    */
   public Adapter createUnitCarryingElementAdapter() {
      return null;
   }

   /**
    * Creates a new adapter for an object of class '{@link de_av.uka_av.ipd_av.sdq_av.units_av.Unit <em>Unit</em>}'.
    * <!-- begin-user-doc -->
    * This default implementation returns null so that we can easily ignore cases;
    * it's useful to ignore a case when inheritance will catch all the cases anyway.
    * <!-- end-user-doc -->
    * @return the new adapter.
    * @see de_av.uka_av.ipd_av.sdq_av.units_av.Unit
    * @generated
    */
   public Adapter createUnitAdapter() {
      return null;
   }

   /**
    * Creates a new adapter for an object of class '{@link de_av.uka_av.ipd_av.sdq_av.units_av.BaseUnit <em>Base Unit</em>}'.
    * <!-- begin-user-doc -->
    * This default implementation returns null so that we can easily ignore cases;
    * it's useful to ignore a case when inheritance will catch all the cases anyway.
    * <!-- end-user-doc -->
    * @return the new adapter.
    * @see de_av.uka_av.ipd_av.sdq_av.units_av.BaseUnit
    * @generated
    */
   public Adapter createBaseUnitAdapter() {
      return null;
   }

   /**
    * Creates a new adapter for an object of class '{@link de_av.uka_av.ipd_av.sdq_av.units_av.UnitRepository <em>Unit Repository</em>}'.
    * <!-- begin-user-doc -->
    * This default implementation returns null so that we can easily ignore cases;
    * it's useful to ignore a case when inheritance will catch all the cases anyway.
    * <!-- end-user-doc -->
    * @return the new adapter.
    * @see de_av.uka_av.ipd_av.sdq_av.units_av.UnitRepository
    * @generated
    */
   public Adapter createUnitRepositoryAdapter() {
      return null;
   }

   /**
    * Creates a new adapter for an object of class '{@link de_av.uka_av.ipd_av.sdq_av.units_av.UnitMultiplication <em>Unit Multiplication</em>}'.
    * <!-- begin-user-doc -->
    * This default implementation returns null so that we can easily ignore cases;
    * it's useful to ignore a case when inheritance will catch all the cases anyway.
    * <!-- end-user-doc -->
    * @return the new adapter.
    * @see de_av.uka_av.ipd_av.sdq_av.units_av.UnitMultiplication
    * @generated
    */
   public Adapter createUnitMultiplicationAdapter() {
      return null;
   }

   /**
    * Creates a new adapter for an object of class '{@link de_av.uka_av.ipd_av.sdq_av.units_av.UnitPower <em>Unit Power</em>}'.
    * <!-- begin-user-doc -->
    * This default implementation returns null so that we can easily ignore cases;
    * it's useful to ignore a case when inheritance will catch all the cases anyway.
    * <!-- end-user-doc -->
    * @return the new adapter.
    * @see de_av.uka_av.ipd_av.sdq_av.units_av.UnitPower
    * @generated
    */
   public Adapter createUnitPowerAdapter() {
      return null;
   }

   /**
    * Creates a new adapter for an object of class '{@link de_av.uka_av.ipd_av.sdq_av.units_av.UnitLiteral <em>Unit Literal</em>}'.
    * <!-- begin-user-doc -->
    * This default implementation returns null so that we can easily ignore cases;
    * it's useful to ignore a case when inheritance will catch all the cases anyway.
    * <!-- end-user-doc -->
    * @return the new adapter.
    * @see de_av.uka_av.ipd_av.sdq_av.units_av.UnitLiteral
    * @generated
    */
   public Adapter createUnitLiteralAdapter() {
      return null;
   }

   /**
    * Creates a new adapter for an object of class '{@link de_av.uka_av.ipd_av.sdq_av.units_av.Advice <em>Advice</em>}'.
    * <!-- begin-user-doc -->
    * This default implementation returns null so that we can easily ignore cases;
    * it's useful to ignore a case when inheritance will catch all the cases anyway.
    * <!-- end-user-doc -->
    * @return the new adapter.
    * @see de_av.uka_av.ipd_av.sdq_av.units_av.Advice
    * @generated
    */
   public Adapter createAdviceAdapter() {
      return null;
   }

   /**
    * Creates a new adapter for an object of class '{@link de_av.uka_av.ipd_av.sdq_av.units_av.GlobalScope <em>Global Scope</em>}'.
    * <!-- begin-user-doc -->
    * This default implementation returns null so that we can easily ignore cases;
    * it's useful to ignore a case when inheritance will catch all the cases anyway.
    * <!-- end-user-doc -->
    * @return the new adapter.
    * @see de_av.uka_av.ipd_av.sdq_av.units_av.GlobalScope
    * @generated
    */
   public Adapter createGlobalScopeAdapter() {
      return null;
   }

   /**
    * Creates a new adapter for an object of class '{@link de_av.uka_av.ipd_av.sdq_av.units_av.PerJoinPointScope <em>Per Join Point Scope</em>}'.
    * <!-- begin-user-doc -->
    * This default implementation returns null so that we can easily ignore cases;
    * it's useful to ignore a case when inheritance will catch all the cases anyway.
    * <!-- end-user-doc -->
    * @return the new adapter.
    * @see de_av.uka_av.ipd_av.sdq_av.units_av.PerJoinPointScope
    * @generated
    */
   public Adapter createPerJoinPointScopeAdapter() {
      return null;
   }

   /**
    * Creates a new adapter for the default case.
    * <!-- begin-user-doc -->
    * This default implementation returns null.
    * <!-- end-user-doc -->
    * @return the new adapter.
    * @generated
    */
   public Adapter createEObjectAdapter() {
      return null;
   }

} //Units_avAdapterFactory
