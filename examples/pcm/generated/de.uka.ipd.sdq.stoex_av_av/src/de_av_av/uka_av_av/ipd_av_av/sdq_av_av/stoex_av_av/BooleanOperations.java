/**
 */
package de_av_av.uka_av_av.ipd_av_av.sdq_av_av.stoex_av_av;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Boolean Operations</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see de_av_av.uka_av_av.ipd_av_av.sdq_av_av.stoex_av_av.Stoex_av_avPackage#getBooleanOperations()
 * @model
 * @generated
 */
public enum BooleanOperations implements Enumerator {
   /**
    * The '<em><b>AND</b></em>' literal object.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @see #AND_VALUE
    * @generated
    * @ordered
    */
   AND(0, "AND", "AND"),

   /**
    * The '<em><b>OR</b></em>' literal object.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @see #OR_VALUE
    * @generated
    * @ordered
    */
   OR(1, "OR", "OR"),

   /**
    * The '<em><b>XOR</b></em>' literal object.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @see #XOR_VALUE
    * @generated
    * @ordered
    */
   XOR(2, "XOR", "XOR");

   /**
    * The '<em><b>AND</b></em>' literal value.
    * <!-- begin-user-doc -->
    * <p>
    * If the meaning of '<em><b>AND</b></em>' literal object isn't clear,
    * there really should be more of a description here...
    * </p>
    * <!-- end-user-doc -->
    * @see #AND
    * @model
    * @generated
    * @ordered
    */
   public static final int AND_VALUE = 0;

   /**
    * The '<em><b>OR</b></em>' literal value.
    * <!-- begin-user-doc -->
    * <p>
    * If the meaning of '<em><b>OR</b></em>' literal object isn't clear,
    * there really should be more of a description here...
    * </p>
    * <!-- end-user-doc -->
    * @see #OR
    * @model
    * @generated
    * @ordered
    */
   public static final int OR_VALUE = 1;

   /**
    * The '<em><b>XOR</b></em>' literal value.
    * <!-- begin-user-doc -->
    * <p>
    * If the meaning of '<em><b>XOR</b></em>' literal object isn't clear,
    * there really should be more of a description here...
    * </p>
    * <!-- end-user-doc -->
    * @see #XOR
    * @model
    * @generated
    * @ordered
    */
   public static final int XOR_VALUE = 2;

   /**
    * An array of all the '<em><b>Boolean Operations</b></em>' enumerators.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   private static final BooleanOperations[] VALUES_ARRAY =
      new BooleanOperations[] {
         AND,
         OR,
         XOR,
      };

   /**
    * A public read-only list of all the '<em><b>Boolean Operations</b></em>' enumerators.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public static final List<BooleanOperations> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

   /**
    * Returns the '<em><b>Boolean Operations</b></em>' literal with the specified literal value.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public static BooleanOperations get(String literal) {
      for (int i = 0; i < VALUES_ARRAY.length; ++i) {
         BooleanOperations result = VALUES_ARRAY[i];
         if (result.toString().equals(literal)) {
            return result;
         }
      }
      return null;
   }

   /**
    * Returns the '<em><b>Boolean Operations</b></em>' literal with the specified name.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public static BooleanOperations getByName(String name) {
      for (int i = 0; i < VALUES_ARRAY.length; ++i) {
         BooleanOperations result = VALUES_ARRAY[i];
         if (result.getName().equals(name)) {
            return result;
         }
      }
      return null;
   }

   /**
    * Returns the '<em><b>Boolean Operations</b></em>' literal with the specified integer value.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public static BooleanOperations get(int value) {
      switch (value) {
         case AND_VALUE: return AND;
         case OR_VALUE: return OR;
         case XOR_VALUE: return XOR;
      }
      return null;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   private final int value;

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   private final String name;

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   private final String literal;

   /**
    * Only this class can construct instances.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   private BooleanOperations(int value, String name, String literal) {
      this.value = value;
      this.name = name;
      this.literal = literal;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public int getValue() {
     return value;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public String getName() {
     return name;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public String getLiteral() {
     return literal;
   }

   /**
    * Returns the literal value of the enumerator, which is its string representation.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   @Override
   public String toString() {
      return literal;
   }
   
} //BooleanOperations
