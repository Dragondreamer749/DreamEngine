package github.dragondreamer749.dreamengine.registry;

import java.util.Map;
import java.util.TreeMap;
import java.util.stream.Stream;

public class Registry<E extends RegistryEntry<E>> {

	 private Map<ResourceLocation,E> backingMap;

	 
	 public Registry(){	
		 
		 backingMap = new TreeMap<>();
	 }
	 
	 public void addEntry(E e) {
		 
		 if(backingMap.putIfAbsent(e.getName(), e)!= null)
		 	throw new IllegalArgumentException("Wait... I know you. (Registry entry already has that name)");
		 
	 }
	 
	 
	 public E getEntry(ResourceLocation resource) {
		 
		 return (E) backingMap.get(resource).getName();
		  
	 }
	 
	 public Stream<E> streamEntry(){
		 
		 return backingMap.values().stream();
	 }
}
