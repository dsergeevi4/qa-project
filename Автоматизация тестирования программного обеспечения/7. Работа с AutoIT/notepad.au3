Run("notepad.exe")
$hWnd=WinWait("Безымянный – Блокнот")
WinActivate($hWnd)
Sleep(1000)
Local $Pos=WinGetPos($hWnd)
WinMove($hWnd,"",100,100,500,500)


Send("Привет, мир!")
Opt("WinTitleMatchMode", 4)
WinWait("*Безымянный – Блокнот","")
WinMenuSelectItem("*Безымянный – Блокнот","","&Правка","&Заменить...	CTRL+H")
ControlClick("*Безымянный – Блокнот","","Edit1")
ControlCommand("*Безымянный – Блокнот","","Edit","Editpaste","мир")
ControlClick("*Безымянный – Блокнот","","Edit1")
ControlCommand("*Безымянный – Блокнот","","Edit","Editpaste","Россия")
WinWait("Заменить","С учетом ре&гистра")
ControlClick("Заменить","С учетом ре&гистра","Button6")
WinWait("*Безымянный – Блокнот","")
WinMenuSelectItem("*Безымянный – Блокнот","","&Файл","&Сохранить	CTRL+S")
WinWait("Сохранение","")
ControlClick("Сохранение","","Edit1")
Sleep(500)
ControlSetText("Сохранение", "*.txt", "[CLASS:Edit; INSTANCE:1]", "test1.txt")
ControlClick("Сохранение","","Button2")