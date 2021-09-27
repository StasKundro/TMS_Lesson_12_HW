package com.tms.thirdTask.synchronize;

public class Remove implements Runnable {
    private Main x;

    public Remove(Main x){
        this.x = x;
    }

    @Override
    public void run() {
        doInnerLogic();
    }

    private void doInnerLogic() {
        while (true) {
            x.get();
        }
    }
}
