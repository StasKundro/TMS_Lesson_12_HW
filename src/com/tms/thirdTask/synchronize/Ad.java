package com.tms.thirdTask.synchronize;

public class Ad implements Runnable{
    private Main x;

    public Ad(Main x){
        this.x = x;
    }

    @Override
    public void run() {
        doInnerLogic();
    }

    private void doInnerLogic() {
        while (true) {
            x.put();
        }
    }
}
