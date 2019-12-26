package github.dragondreamer749.dreamengine.registry;

public interface RegistryEntry<E extends RegistryEntry<E>> {

	public ResourceLocation getName();
	
	public Class<E> getType();

}
