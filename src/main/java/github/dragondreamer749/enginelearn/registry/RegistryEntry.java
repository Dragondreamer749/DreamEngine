package github.dragondreamer749.enginelearn.registry;

public interface RegistryEntry<e extends RegistryEntry<e>> {

	public ResourceLocation getName();
	
	public Class<e> getType();
	
}
