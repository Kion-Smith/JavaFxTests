import java.time.LocalDate;

import javafx.beans.property.IntegerProperty;
import javafx.beans.property.ObjectProperty;
import javafx.beans.property.SimpleIntegerProperty;
import javafx.beans.property.SimpleObjectProperty;
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;

public class Person
{
	private final StringProperty firstName;
	private final StringProperty lastName;
    private final StringProperty street;
    private final IntegerProperty postalCode;
    private final StringProperty city;
    private final ObjectProperty<LocalDate> birthday;
    
    //sets the other person constructor to null
    public Person() 
    {
        this(null, null);
    }
    
    public Person(String fn, String ln) 
    {
        firstName = new SimpleStringProperty(fn);
        lastName = new SimpleStringProperty(ln);

     
        street = new SimpleStringProperty("some street");
        postalCode = new SimpleIntegerProperty(1234);
       	city = new SimpleStringProperty("some city");
       	birthday = new SimpleObjectProperty<LocalDate>(LocalDate.of(1999, 2, 21));
    }
    
    public String getFirstName() 
    {
        return firstName.get();
    }

    public void setFirstName(String fn) 
    {
        firstName.set(fn);
    }

    public StringProperty firstNameProperty() 
    {
        return firstName;
    }

    public String getLastName() 
    {
        return lastName.get();
    }

    public void setLastName(String ln) 
    {
        lastName.set(ln);
    }

    public StringProperty lastNameProperty() 
    {
        return lastName;
    }

    public String getStreet()
    {
        return street.get();
    }

    public void setStreet(String s) 
    {
        street.set(s);
    }

    public StringProperty streetProperty() 
    {
        return street;
    }

    public int getPostalCode() 
    {
        return postalCode.get();
    }

    public void setPostalCode(int pc) 
    {
        postalCode.set(pc);
    }

    public IntegerProperty postalCodeProperty() 
    {
        return postalCode;
    }

    public String getCity() 
    {
        return city.get();
    }

    public void setCity(String c)
    {
        city.set(c);
    }

    public StringProperty cityProperty() 
    {
        return city;
    }

    public LocalDate getBirthday() 
    {
        return birthday.get();
    }

    public void setBirthday(LocalDate b) 
    {
        birthday.set(b);
    }

    public ObjectProperty<LocalDate> birthdayProperty() 
    {
        return birthday;
    }

    
}
