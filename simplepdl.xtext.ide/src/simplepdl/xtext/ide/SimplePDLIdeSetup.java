/*
 * generated by Xtext 2.31.0
 */
package simplepdl.xtext.ide;

import com.google.inject.Guice;
import com.google.inject.Injector;
import org.eclipse.xtext.util.Modules2;
import simplepdl.xtext.SimplePDLRuntimeModule;
import simplepdl.xtext.SimplePDLStandaloneSetup;

/**
 * Initialization support for running Xtext languages as language servers.
 */
public class SimplePDLIdeSetup extends SimplePDLStandaloneSetup {

	@Override
	public Injector createInjector() {
		return Guice.createInjector(Modules2.mixin(new SimplePDLRuntimeModule(), new SimplePDLIdeModule()));
	}
	
}
