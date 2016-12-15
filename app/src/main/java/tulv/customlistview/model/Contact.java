package tulv.customlistview.model;

/**
 * Created by tulv on 12/15/2016.
 */
public class Contact {
    private int mColor;
    private String mName;
    private String mPhone;

    public Contact(int mColor, String mName, String mPhone) {
        this.mColor = mColor;
        this.mName = mName;
        this.mPhone = mPhone;
    }

    public int getmColor() {
        return mColor;
    }

    public void setmColor(int mColor) {
        this.mColor = mColor;
    }

    public String getmName() {
        return mName;
    }

    public void setmName(String mName) {
        this.mName = mName;
    }

    public String getmPhone() {
        return mPhone;
    }

    public void setmPhone(String mPhone) {
        this.mPhone = mPhone;
    }
}
