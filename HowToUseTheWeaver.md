# Introduction #

There are currently two different ways of using GeKo:

<a href='Hidden comment: 
# You can download an Eclipse installation that has everything you need in it (including source code, examples and EMF dependencies).
'></a>
  1. You can download a zip containing all GeKo Eclipse plug-in projects (including source code and plug-in projects containing examples but excluding EMF dependencies).
  1. Or you can download a zip containing only the plug-in projects needed to use GeKo with your models (including source-code but excluding examples, extensions and EMF dependencies).

(As soon as GeKo leaves the beta stage we will also provide an Eclipse Update Site.)


# Simple Usage #

Once you downloaded GeKo the way to use it is always the same:

  1. Start an Eclipse instance that runs the GeKo plug-ins. (To do this you can either drop the plug-in jars into the plugins or dropins folder of your Eclipse, or you import the projects into the workspace of your Eclipse as follows: right-click in your project explorer and select "Import...", then choose "General" and "Existing Projects into Workspace" and select the downloaded archive. Then you need to run a new instance using a run / debug configuration with all plug-ins enabled and enough (>=512 MB) PermGen space.)
  1. If you want to check your installation run the tests as described below under "Regression Testing"
  1. Select the `*`.ecore file of the metamodel used by the models you want to weave and right-click on it. In the appearing "GeKo Weaver" submenu select the option "Generate Base, Pointcut and Advice Editors". (Sorry: As a first workaround you also have to manipulate the MANIFEST.MF of the plug-in "lu.uni.geko.joinpointdetection.drools": add the model code plug-in that was generated for your metamodel to the required bundles and add its packages to the imported packages. We apologize for the inconvenience.)
  1. Go to the folder where the base model that you want to weave is located. Right-click on it and in the appearing "New" submenu select the option "Other...". In the appearing wizard there is a category "Example EMF Model Creation Wizards". In it you should find a pointcut editor for your metamodel. Select it and click on "Next". Decide on a location and file name and click on "Next". _Choose "Pointcut" from the "Model Object" dropdown list_ and click on "Finish".
  1. In the created pointcut model you can add arbitrary model elements by right-clicking on the root element "Pointcut" and choosing an entry from the "New Child" submenu.
  1. You can design your advice model in a similar way using the generated Wizard.
  1. Once you are ready for weaving select your base, pointcut and advice model, right-click on one of them and choose "Weave (Inferring Pointcut to Advice Mapping)" in the "GeKo Weaver" submenu.

# Regression Testing #

For regression testing or to check whether your installation of GeKo works with the default examples perform the following steps:

  1. Install GeKo as described above in the first step of "Simple Usage"
  1. Import all projects from the folder "examples" into the Eclipse workspace running GeKo (Right-click in your project explorer and select "Import...", then choose "General" and "Existing Projects into Workspace" and select the content of the "examples" folder)
  1. Navigate to the "model" folder of the example test project that you want to test, right-click on the folders of the examples that you want to test (e.g. 01, 02 etc.) an select "GeKo Weaver" from the menu and choose "Run Asymmetric Weaver Tests in selected Folders". Make sure that you selected the right folders that also contain archetype models to which the result can be compared.
  1. No runtime exception should be thrown and for each test case the last message in the console should be of the form "Sucessfully completed all 42 weaver tests in ...".

# Custom Pointcut to Advice Mappings #

Whenever you design a pointcut and advice for which GeKo cannot guess which pointcut element corresponds to which advice element by looking at String attributes you have to help out a little bit:
  1. Right-click once again on the folder containing your base model. In the appearing "New" submenu select once again the option "Other...". Create a new "Pc2AvMapping Model" using the generated wizard just as you did for the pointcut and advice model. _This time select "Mapping" as root "Model Object"._
  1. Create mapping entries using the familiar "New Child" submenu and refer to elements of the pointcut and advice model in the property view.
  1. Once you created mapping entries for all pointcut and advice elements that were not matched automatically by Geko you are ready for weaving: select your base, pointcut, advice and mapping model, right-click on one of them and choose "Weave (Inferring Completion of Pointcut to Advice Mapping)" in the "GeKo Weaver" submenu.


# Creating Own Extensions #

If you want to create extensions for GeKo because your metamodel cannot be handled in a completely generic way have a look at the source code and the [JavaDoc](http://svn.codespot.com/a/eclipselabs.org/geko-model-weaver/trunk/doc/0.1/index.html). Although [ohloh.net](https://www.ohloh.net/p/geko-model-weaver) believes that GeKo has "Extremely well-commented source code" you are welcome to get in contact with a developer in case something remains unclear.