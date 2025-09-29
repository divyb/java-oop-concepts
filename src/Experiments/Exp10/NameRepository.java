interface Iterator
{
  public boolean hasNext();
  public Object next();
}
interface Container
{
  public Iterator getIterator();
}



class collectionOfNames implements Container
{
    public Iterator getIterator()
  {
    return new collectionOfNamesIterate();
  }
  String names[]={"Mercedes","BMW","McLaren","Ferrari","Porche"};

  private class collectionOfNamesIterate implements Iterator
  {
    int i;

    public boolean hasNext()
    {
      if(i<names.length)
        return true;

      return false;
    }
    public Object next()
    {
      if(this.hasNext())
        return names[i++];

      return null;
    }
  }
}
