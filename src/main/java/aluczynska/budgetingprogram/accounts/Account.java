package aluczynska.budgetingprogram.accounts;

import aluczynska.budgetingprogram.ProvidesId;
import com.sun.istack.NotNull;

import javax.persistence.*;

import java.util.Objects;

@Entity
public class Account implements ProvidesId {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    @NotNull
    @Column(unique = true)
    private String name;

    private Boolean isSelected = false;
    private Boolean isDefault = false;
    private AccountType type;

    @Deprecated
    private Boolean isReadOnly = false;




    public Account() {
    }

    public long getID() {
        return id;
    }

    public void setID(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    public Boolean isSelected() {
        return isSelected;
    }

    public void setSelected(Boolean selected) {
        isSelected = selected;
    }

    public Boolean isDefault() {
        return isDefault;
    }

    public void setDefault(Boolean aDefault) {
        isDefault = aDefault;
    }
    public AccountType getType()
    {
        return type;
    }

    public void setType(AccountType type)
    {
        this.type = type;
    }

    @Deprecated
    public Boolean isReadOnly() {
        return isReadOnly;
    }

    @Deprecated
    public void setReadOnly(Boolean readOnly) {
        isReadOnly = readOnly;
    }


    @Override
    public String toString() {
        return "Account{" +
                "ID=" + id +
                ", name='" + name + '\'' +
                ", isSelected=" + isSelected +
                ", isDefault=" + isDefault +
                ", type=" + type +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Account account = (Account) o;
        return Objects.equals(id, account.id) &&
                Objects.equals(name, account.name) &&
                Objects.equals(isSelected, account.isSelected) &&
                Objects.equals(isDefault, account.isDefault)&&
                type == account.type;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, isSelected, isDefault, type);
    }

    @Override
    public Long getId() {
        return null;
    }
}
