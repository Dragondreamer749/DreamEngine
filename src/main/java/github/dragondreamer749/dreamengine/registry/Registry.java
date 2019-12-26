package github.dragondreamer749.dreamengine.registry;

import java.util.Map;

public class Registry<E extends RegistryEntry<E>> {

	 private Map<ResourceLocation,E> backingMap;

	 
	 public void addEntry(E e) {
		 
		 if(backingMap.putIfAbsent(e.getName(), e)!= null)
		 	throw new IllegalArgumentException("Wait... I know you. (Registry entry already has that name)");
		
		 
	 }
	 
	 public E getEntry(ResourceLocation resource) {
		 
		 
		 
	 }
}
