
class Phone {

    void lock() {
        System.err.println("Phone Locked");
    }

    void unlock(Pin pn) {
        System.err.println("Phone Unlocked using pin");
    }

    void unlock(Pass ps) {
        System.err.println("Phone Unlocked using pass");
    }

    void unlock(Pattern pt) {
        System.err.println("Phone Unlocked using pattern");
    }

    void unlock(FaceId fi) {
        System.err.println("Phone Unlocked using faceid");
    }
}

class Pin {

}

class Pass {

}

class Pattern {

}

class FaceId {

}

class lockunlock {

    public static void main(String[] args) {
        Pin pn = new Pin();
        Pass ps = new Pass();
        Pattern pt = new Pattern();
        FaceId fi = new FaceId();
        Phone ph = new Phone();
        ph.lock();

        ph.unlock(pn);
        ph.unlock(ps);
        ph.unlock(pt);
        ph.unlock(fi);

    }
}
