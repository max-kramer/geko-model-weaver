If you want to use the IFC examples for GeKo you also need the IFC-Ecore bridge that is described in this article:
http://link.springer.com/content/pdf/10.1007%2F978-3-642-21732-6_7.pdf
(A Transformation Workbench for Building Information Models - Jim Steel, Keith Duddy, and Robin Drogemuller - Queensland University of Technology, Australia - {james.steel,keith.duddy,robin.drogemuller}@qut.edu.au)

Furthermore, you should replace the current MANIFEST.MF of the lu.uni.geko.joinpointdetection.drools plugin with the MANIFEST_WITH_IFC.MF

If you do not want to use the IFC examples simply close this project or delete this plugin after checkout.