/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package photographers;

/**
 *
 * @author ARMANCHI
 */

interface Photographer
{
public void prepareScene();
public String takePhotograph();
}
class ParentCamera implements Photographer
{
    @Override
    public void prepareScene()
    {
        System.out.println("Hey kids,stand over there and smile");
    }
    @Override
    public String takePhotograph()
    {
        return "younger sister is pulling a face";
    }
    
}

class SecurityCamera implements Photographer
{
    @Override
    public void prepareScene()
    {
        System.out.println("Hey Be careful, Cameras are on you");
    }
    @Override
    public String takePhotograph()
    {
        return "a thief was caught on security cam";
    }
    
}
class TrafficCamera implements Photographer
{
    @Override
    public void prepareScene()
    {
        System.out.println("Ride Carefully, as Traffic cam is ON");
    }
    @Override
    public String takePhotograph()
    {
        return "a car XXX didnt stop on red light";
    }
    
}

public class Photographers {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Photographer p;
        p=new ParentCamera();
        p.prepareScene();
        System.out.println(p.takePhotograph());
        p=new SecurityCamera();
        p.prepareScene();
        System.out.println(p.takePhotograph());
        p=new TrafficCamera();
        p.prepareScene();
        System.out.println(p.takePhotograph());
        
    }
    
}
