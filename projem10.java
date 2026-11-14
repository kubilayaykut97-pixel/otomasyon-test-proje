[Test]
public void UrunAramaTesti()
{
    // 1. Mağaza sayfasına git
    driver.Navigate().GoToUrl("https://ornek.com/magaza");

    // 2. Arama kutusuna "Kulaklık" yaz
    driver.FindElement(By.Id("txtSearch")).SendKeys("Kulaklık");

    // 3. Arama butonuna tıkla
    driver.FindElement(By.Id("btnSearch")).Click();

    // 4. Başlığın "Kulaklık Modelleri" içerdiğini doğrula
    Assert.That(driver.Title, Does.Contain("Kulaklık Modelleri"));
}