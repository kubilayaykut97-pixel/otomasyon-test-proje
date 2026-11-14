[Test]
public void  Ürün Detay Sayfasından Favorilere Ekleme Testi()
{
    // 1. Kayıt sayfasına git
    driver.Navigate().GoToUrl("https://ornek.com/urun/kaza);

    
    driver.FindElement(By.Id("addFavBtn")).Click();

    // 6. Başarılı kayıt olunduğunu doğrula
    Assert.That(driver.Title, Does.Contain("Favorilerim"));
    
}