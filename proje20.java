[Test]
public void  AdresEklemeVeSiparisOnayTest)
{
    // 1. Kayıt sayfasına git
    driver.Navigate().GoToUrl(""https://ornek.com/adres-ekle)

driver.FindElement(By.Id("txtAdressTitle")).SendKeys("Ev Adresim");

driver.FindElement(By.Id("txtAdressDetail")).SendKeys("Istanbul Kadıkoy");



 driver.FindElement(By.Id("SaveAddressBtn")).Click();

    // 6. Başarılı kayıt olunduğunu doğrula
    Assert.That(driver.Title, Does.Contain("Siparis Özeti"));
    
}