/**
 */
package de_pc_pc.uka_pc_pc.ipd_pc_pc.sdq_pc_pc.pcm_pc_pc.repository_pc_pc;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Parameter Modifier</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * <!-- begin-model-doc -->
 * Parameter modifiers like known from C#.
 * <!-- end-model-doc -->
 * @see de_pc_pc.uka_pc_pc.ipd_pc_pc.sdq_pc_pc.pcm_pc_pc.repository_pc_pc.Repository_pc_pcPackage#getParameterModifier()
 * @model
 * @generated
 */
public enum ParameterModifier implements Enumerator {
   /**
    * The '<em><b>None</b></em>' literal object.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @see #NONE_VALUE
    * @generated
    * @ordered
    */
   NONE(0, "none", "none"),

   /**
    * The '<em><b>In</b></em>' literal object.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @see #IN_VALUE
    * @generated
    * @ordered
    */
   IN(1, "in", "in"),

   /**
    * The '<em><b>Out</b></em>' literal object.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @see #OUT_VALUE
    * @generated
    * @ordered
    */
   OUT(2, "out", "out"),

   /**
    * The '<em><b>Inout</b></em>' literal object.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @see #INOUT_VALUE
    * @generated
    * @ordered
    */
   INOUT(3, "inout", "inout");

   /**
    * The '<em><b>None</b></em>' literal value.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * <!-- begin-model-doc -->
    * Use this value if no parameter modifier shall be applied.
    * <!-- end-model-doc -->
    * @see #NONE
    * @model name="none"
    * @generated
    * @ordered
    */
   public static final int NONE_VALUE = 0;

   /**
    * The '<em><b>In</b></em>' literal value.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * <!-- begin-model-doc -->
    * "in" according to C# semantics
    * <!-- end-model-doc -->
    * @see #IN
    * @model name="in"
    * @generated
    * @ordered
    */
   public static final int IN_VALUE = 1;

   /**
    * The '<em><b>Out</b></em>' literal value.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * <!-- begin-model-doc -->
    * "out" according to C# semantics
    * <!-- end-model-doc -->
    * @see #OUT
    * @model name="out"
    * @generated
    * @ordered
    */
   public static final int OUT_VALUE = 2;

   /**
    * The '<em><b>Inout</b></em>' literal value.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * <!-- begin-model-doc -->
    * ref" according to C# semantics
    * <!-- end-model-doc -->
    * @see #INOUT
    * @model name="inout"
    * @generated
    * @ordered
    */
   public static final int INOUT_VALUE = 3;

   /**
    * An array of all the '<em><b>Parameter Modifier</b></em>' enumerators.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   private static final ParameterModifier[] VALUES_ARRAY =
      new ParameterModifier[] {
         NONE,
         IN,
         OUT,
         INOUT,
      };

   /**
    * A public read-only list of all the '<em><b>Parameter Modifier</b></em>' enumerators.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public static final List<ParameterModifier> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

   /**
    * Returns the '<em><b>Parameter Modifier</b></em>' literal with the specified literal value.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public static ParameterModifier get(String literal) {
      for (int i = 0; i < VALUES_ARRAY.length; ++i) {
         ParameterModifier result = VALUES_ARRAY[i];
         if (result.toString().equals(literal)) {
            return result;
         }
      }
      return null;
   }

   /**
    * Returns the '<em><b>Parameter Modifier</b></em>' literal with the specified name.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public static ParameterModifier getByName(String name) {
      for (int i = 0; i < VALUES_ARRAY.length; ++i) {
         ParameterModifier result = VALUES_ARRAY[i];
         if (result.getName().equals(name)) {
            return result;
         }
      }
      return null;
   }

   /**
    * Returns the '<em><b>Parameter Modifier</b></em>' literal with the specified integer value.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public static ParameterModifier get(int value) {
      switch (value) {
         case NONE_VALUE: return NONE;
         case IN_VALUE: return IN;
         case OUT_VALUE: return OUT;
         case INOUT_VALUE: return INOUT;
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
   private ParameterModifier(int value, String name, String literal) {
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
   
} //ParameterModifier
