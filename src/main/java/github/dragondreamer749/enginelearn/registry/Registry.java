package github.dragondreamer749.enginelearn.registry;

import java.util.Map;

public class Registry<e extends RegistryEntry<e>> {

	 private Map<ResourceLocation,e> backingMap;

	 
	 public void addEntry(e) {
		 
		 if(backingMap.putIfAbsent(e.getName(e)!= null, e)) {
			 
			 
		 }
		
		 
	 }
	 
	 public e readEntrys() {
		 
	 }
}
