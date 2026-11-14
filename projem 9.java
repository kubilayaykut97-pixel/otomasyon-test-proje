[Test]
public void GirisYapmaTesti()
{
    driver.Navigate().GoToUrl("https://ornek.com/urunler");

    driver.FindElement(By.Id("username")).SendKeys(Kubilay);

    driver.FindElement(By.Id("password")).SendKeys(gizliSifre123);

    driver.FindElement(By.Id("LoginBtn")).Click();

    Assert.That(driver.Title, Does.Contain("Ana Sayfa"));
}