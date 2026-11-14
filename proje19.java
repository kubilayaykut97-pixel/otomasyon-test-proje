[Test]
public void  SepeteUrunEkleme)
{
    // 1. Kayıt sayfasına git
    driver.Navigate().GoToUrl("https://ornek.com/kategori/telefon)

    


    driver.FindElement(By.Id("detayBtn")).click();


 driver.FindElement(By.Id("addToCartBtn")).Click();

    // 6. Başarılı kayıt olunduğunu doğrula
    Assert.That(driver.Title, Does.Contain("Sepetim"));
    
}