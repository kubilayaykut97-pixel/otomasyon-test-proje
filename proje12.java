[Test]
public void KayitOlmaTesti()
{
    // 1. Kayıt sayfasına git
    driver.Navigate().GoToUrl("https://ornek.com/kayit");

    // 2. Ad Soyad alanına ismini yaz
    driver.FindElement(By.Id("txtName")).SendKeys("Kubilay");

    // 3. E-posta alanına mail adresini yaz
    driver.FindElement(By.Id("txtEmail")).SendKeys("kubilay@ornek.com");

    // 4. Şifre alanına şifreni yaz
    driver.FindElement(By.Id("txtPassword")).SendKeys("GuvenliSifre123");

    // 5. Kayıt ol butonuna tıkla
    driver.FindElement(By.Id("btnRegister")).Click();

    // 6. Başarılı kayıt olunduğunu doğrula
    Assert.That(driver.Title, Does.Contain("Kayıt Başarılı"));
}