[Test]
public void  Urunaramatesti)
{
    // 1. Kayıt sayfasına git
    driver.Navigate().GoToUrl("https://ornek.com/anasayfa)

    


    driver.FindElement(By.Id("searchBox")).Sendkeys("Laptop");


 driver.FindElement(By.Id("searchBtn")).Click();

    // 6. Başarılı kayıt olunduğunu doğrula
    Assert.That(driver.Title, Does.Contain("Laptop Modelleri"));
    
}