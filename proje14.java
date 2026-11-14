[Test]
public void  Sepet Tutar Ürün Kontrol Testi()
{
    // 1. Kayıt sayfasına git
    driver.Navigate().GoToUrl("https://ornek.com/sepet");



    // 4. Şifre alanına şifreni yaz
    driver.FindElement(By.Id("btnDelete")).Click();

    // 5. Kayıt ol butonuna tıkla
    driver.FindElement(By.Id("btnContinue")).Click();

    // 6. Başarılı kayıt olunduğunu doğrula
    Assert.That(driver.Title, Does.Contain("Boş Sepet"));
}