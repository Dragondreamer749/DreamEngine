package github.dragondreamer749.enginelearn.registry;

import java.util.Map;

public class Registry<E extends RegistryEntry<E>> {

	 private Map<ResourceLocation,E> backingMap;

	 
	 public void addEntry(E e) {
		 
		 if(backingMap.putIfAbsent(e.getName(), e)!= null)
		 	throw new IllegalArgumentException();
		
		 
	 }
	 
	 public E readEntrys() {
		 
	 }
}
