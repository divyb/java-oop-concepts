interface AddListener
{
    String addition (String p, String q);
} 
class AddTest implements AddListener
{
    public String addition(String a,String b)
    {
        return Float.parseFloat(a.trim())+Float.parseFloat(b.trim())+"";
        //return c+"";   not required
    }
}
