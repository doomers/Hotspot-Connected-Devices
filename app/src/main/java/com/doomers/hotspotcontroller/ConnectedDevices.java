package com.doomers.hotspotcontroller;


import android.view.View;

/**
 * Simple POJO model for example
 */
public class ConnectedDevices {

    private View.OnClickListener requestBtnClickListener;
    private String IpAddr;
    private String HWAddr;

    private String Device;
    private boolean isReachable;






    public ConnectedDevices(String ipAddr, String HWAddr, String device, boolean isReachable) {
        super();

        this.IpAddr = ipAddr;
        this.HWAddr = HWAddr;
        this.Device = device;
        this.isReachable = isReachable;
    }

    public String getIpAddr() {
        return IpAddr;
    }
    public void setIpAddr(String ipAddr) {
        IpAddr = ipAddr;
    }


    public String getHWAddr() {
        return HWAddr;
    }
    public void setHWAddr(String hWAddr) {
        HWAddr = hWAddr;
    }


    public String getDevice() {
        return Device;
    }
    public void setDevice(String device) {
        Device = device;
    }


    public boolean isReachable() {
        return isReachable;
    }
    public void setReachable(boolean isReachable) {
        this.isReachable = isReachable;
    }



    public View.OnClickListener getRequestBtnClickListener() {
        return requestBtnClickListener;
    }

    public void setRequestBtnClickListener(View.OnClickListener requestBtnClickListener) {
        this.requestBtnClickListener = requestBtnClickListener;
    }

//    @Override
//    public boolean equals(Object o) {
//        if (this == o) return true;
//        if (o == null || getClass() != o.getClass()) return false;
//
//        Item item = (Item) o;
//
//        if (requestsCount != item.requestsCount) return false;
//        if (price != null ? !price.equals(item.price) : item.price != null) return false;
//        if (pledgePrice != null ? !pledgePrice.equals(item.pledgePrice) : item.pledgePrice != null)
//            return false;
//        if (fromAddress != null ? !fromAddress.equals(item.fromAddress) : item.fromAddress != null)
//            return false;
//        if (toAddress != null ? !toAddress.equals(item.toAddress) : item.toAddress != null)
//            return false;
//        if (date != null ? !date.equals(item.date) : item.date != null) return false;
//        return !(time != null ? !time.equals(item.time) : item.time != null);
//
//    }
//
//    @Override
//    public int hashCode() {
//        int result = price != null ? price.hashCode() : 0;
//        result = 31 * result + (pledgePrice != null ? pledgePrice.hashCode() : 0);
//        result = 31 * result + (fromAddress != null ? fromAddress.hashCode() : 0);
//        result = 31 * result + (toAddress != null ? toAddress.hashCode() : 0);
//        result = 31 * result + requestsCount;
//        result = 31 * result + (date != null ? date.hashCode() : 0);
//        result = 31 * result + (time != null ? time.hashCode() : 0);
//        return result;
//    }

    /**
     * @return List of elements prepared for tests
     */
//    public static ArrayList<ConnectedDevices> getTestingList() {
//        ArrayList<ConnectedDevices> items = new ArrayList<>();
//
//        return items;
//
//    }

}