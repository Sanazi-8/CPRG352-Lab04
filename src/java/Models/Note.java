
package Models;

import java.io.Serializable;

/**
 *
 * @author 850354
 */
public class Note implements Serializable {
   
    
    //instanstiate your variables and make sure they are thread safe
    private String userTitle;
    private String userContent;
    
    
    
    
    public Note(String userTitle, String userContent){
        this.userTitle = userTitle;
        this.userContent = userContent;   
    }
    // set getters and setters for each parameter 
    public String getUserTitle() {
    return userTitle;
}
    //set the parameter using void 
    public void setUserTitle(String userTitle){
    this.userTitle= userTitle;
}
     public String getUserContent() {
    return userContent;
}
      public void setUserContent(String userContent){
    this.userContent= userContent;
}
      
    
}
