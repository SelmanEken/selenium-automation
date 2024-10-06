import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class Test_Setting_Name_Lastname_Email extends BaseTest {



    @Test
    public void setName(){
        praticeFormPage.setName("Selman");
        Assertions.assertEquals("Salih", praticeFormPage.getName(),"Name value is not correct");
    }

    @Test
    public void setLastName(){
        praticeFormPage.setLastName("EKEN");
        Assertions.assertEquals("Eken",praticeFormPage.getLastName(),"Last name value is not corrent");
    }

    @Test
    public void email(){
        praticeFormPage.email("selman@gmail.com");
        Assertions.assertEquals("selman@gmail.com",praticeFormPage.getEmail(),"Email value is not correct");
    }
}
