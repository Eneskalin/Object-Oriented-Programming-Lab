a) In Person class there is a repeated code, you should fix it.
    class Person {
        String name;
        int age;
    public Person(int age) {
        this.name = "not reported";
        this.age = age;
    }
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    a) Person sınıfında tekrarlanan kodlar var, bunu
    düzeltmelisiniz.
    b) Verilen Person sınıfına kapsülleme (veri gizleme)
    uygulayın ve gerekli tüm yöntemleri ekleyin. Bu
    yeni sınıfın adı EncapsulatedPerson olmalır.
    c) EncapsulatedPerson sınıfı, herhangi bir geçersiz yaş
    ayarlanırsa (yaş 20 ile 60 arasında olmalıdır) bir
    istisna (hata mesajı ile) fırlatmalıdır.
    d) MainClass içinde, EncapsulatedPerson'dan bir
    örnek/nesne oluşturun, bunun için özellikleri
    (attributes) ayarlayın, herhangi bir istisnayı ele alın
    ve istisna mesajını ekrana yazdırın.
