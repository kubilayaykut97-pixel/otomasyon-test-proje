[Test]
public void SepeteEklemeTesti()
{
    // 1. Mağaza sayfasına git
    driver.Navigate().GoToUrl("https://ornek.com/urun1");

    // 2. Arama kutusuna "Kulaklık" yaz
    driver.FindElement(By.Id("addBasketBtn")).SendKeys("click");

    // 3. Arama butonuna tıkla
    driver.FindElement(By.Id("goTocart")).Click();

    // 4. Başlığın "Kulaklık Modelleri" içerdiğini doğrula
    Assert.That(driver.Title, Does.Contain("Sepetim"));
}