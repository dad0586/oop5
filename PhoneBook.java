public class PhoneBook {
    public String name;
    private int currentIndex = 0; // indexni joylashtirish uchun
    private int maxIndex = 5;
    private Contact[] contactArray = new Contact[maxIndex];

    public PhoneBook(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }
    public void add(String first, String last, String number){

        if (this.currentIndex == this.maxIndex){
            this.maxIndex += 5;

            Contact [] newContactarray =new Contact[this.maxIndex];

            for (int i=0; i<this.currentIndex; i++){
                 newContactarray [i] = this.contactArray[i];
            }
            this.contactArray = newContactarray;
        }

        Contact contact = new Contact(first, last, number);
        this.contactArray[currentIndex] = contact;
        this.currentIndex++;
//        contact.setFirst(first);
//        contact.setLast(last);
//        contact.setNumber(number);

    }

    public void show(){
        for (int i=0; i<currentIndex; i++){
            Contact contact = this.contactArray[i];
            System.out.println(contact.getFirst()  + " " + contact.getLast());
        }

    }
}
