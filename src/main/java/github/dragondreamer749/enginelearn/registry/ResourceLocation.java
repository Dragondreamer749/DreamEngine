package github.dragondreamer749.enginelearn.registry;

import java.util.Objects;

public class ResourceLocation implements Comparable<ResourceLocation> {

    private final String domain;
    private final String path;

    private static final String domainPattern = "[a-z_][a-z0-9_]*";
    private static final String pathPattern = "[a-z_][a-z0-9_]*(/[a-z_][a-z0-9_]*)*";

    private ResourceLocation(String[] split) {
        if(split.length!=2)
            throw new IllegalArgumentException("ResourceLocations MUST Match [a-z_][a-z0-9_]*:[a-z_][a-z0-9_]*(/[a-z_][a-z0-9_]*)*");
        this.domain = split[0];
        this.path = split[1];
        if(!domain.matches(domainPattern)||!path.matches(pathPattern))
            throw new IllegalArgumentException("ResourceLocations MUST Match [a-z_][a-z0-9_]*:[a-z_][a-z0-9_]*(/[a-z_][a-z0-9_]*)*");
    }

    public ResourceLocation(String domain,String path) {
        if(!domain.matches(domainPattern)||!path.matches(pathPattern))
            throw new IllegalArgumentException("ResourceLocations MUST Match [a-z_][a-z0-9_]*:[a-z_][a-z0-9_]*(/[a-z_][a-z0-9_]*)*");
        this.domain = domain;
        this.path = path;
    }
    public ResourceLocation(String name) {
        this(name.split(":"));
    }

    @Override
    public int compareTo(ResourceLocation o) {
        int cmp;
        if((cmp=domain.compareTo(o.domain))!=0)
            return cmp;
        else
            return path.compareTo(o.path);
    }

    @Override
    public int hashCode() {
        return Objects.hash(domain, path);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        ResourceLocation other = (ResourceLocation) obj;
        return Objects.equals(domain, other.domain) && Objects.equals(path, other.path);
    }

}
