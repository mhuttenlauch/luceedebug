package luceedebug;

public interface ICfEntityRef {
    public long getId();
    public int getNamedVariablesCount();
    public int getIndexedVariablesCount();

    // see main impl for details about nullity
    public IDebugEntity maybeNull_asValue(String name);
}
