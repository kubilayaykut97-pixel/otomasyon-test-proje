def giris_kontrol(kullanici, sifre):
    return kullanici == "ahmet" and sifre == "12345"
assert giris_kontrol("ahmet","12345") == True

assert giris_kontrol("ahmet",99999")  == False



print("2 TEST BASARILI") 