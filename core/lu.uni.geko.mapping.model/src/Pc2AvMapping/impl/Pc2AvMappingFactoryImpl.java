/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package Pc2AvMapping.impl;

import Pc2AvMapping.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class Pc2AvMappingFactoryImpl extends EFactoryImpl implements Pc2AvMappingFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static Pc2AvMappingFactory init() {
		try {
			Pc2AvMappingFactory thePc2AvMappingFactory = (Pc2AvMappingFactory)EPackage.Registry.INSTANCE.getEFactory("http://lu.uni.geko.pc2avmapping"); 
			if (thePc2AvMappingFactory != null) {
				return thePc2AvMappingFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new Pc2AvMappingFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Pc2AvMappingFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case Pc2AvMappingPackage.MAPPING: return createMapping();
			case Pc2AvMappingPackage.MAPPING_ENTRY: return createMappingEntry();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Mapping createMapping() {
		MappingImpl mapping = new MappingImpl();
		return mapping;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MappingEntry createMappingEntry() {
		MappingEntryImpl mappingEntry = new MappingEntryImpl();
		return mappingEntry;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Pc2AvMappingPackage getPc2AvMappingPackage() {
		return (Pc2AvMappingPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static Pc2AvMappingPackage getPackage() {
		return Pc2AvMappingPackage.eINSTANCE;
	}

} //Pc2AvMappingFactoryImpl
