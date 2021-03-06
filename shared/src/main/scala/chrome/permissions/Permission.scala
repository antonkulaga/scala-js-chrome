package chrome.permissions

sealed trait Permission

case class HostPermission(urlPattern: String) extends Permission
case class APIPermission(name: String, description: String) extends Permission


object APIPermission {

  val Tabs = APIPermission("tabs", "")
  val Notifications = APIPermission("notifications", "")

  object System {

    val CPU = APIPermission("system.cpu", "")
    val Display = APIPermission("system.display", "")
    val Memory = APIPermission("system.memory", "")
    val Network = APIPermission("system.network", "")

  }

  val TTS = APIPermission("tts", "")
  val Alarms = APIPermission("alarms", "")
  val Browser = APIPermission("browser", "")
  val Idle = APIPermission("idle", "")
  val Power = APIPermission("power", "")
  val Management = APIPermission("management", "")
  val Experimental = APIPermission("experimental", "")
  val Identity = APIPermission("identity", "")
  val GCM = APIPermission("gcm", "")
  val Location = APIPermission("location", "")
  val Sessions = APIPermission("Sessions", "")
  val Proxy = APIPermission("proxy", "")
  val Processes = APIPermission("processes", "")
  val Privacy = APIPermission("privacy", "")
  val Cookies = APIPermission("cookies", "")
  val Storage = APIPermission("storage", "")
  val Wallpaper = APIPermission("wallpaper", "")
  val ContextMenus = APIPermission("contextMenus", "")

  val All: Map[String, APIPermission] = Set(
    Tabs, Notifications, System.CPU, System.Display, System.Memory, System.Network,
    TTS, Alarms, Browser, Idle, Power, Management, Experimental, Identity, GCM,
    Location, Sessions, Proxy, Processes, Privacy, Cookies, Storage, Wallpaper, ContextMenus
  ).map(x => x.name -> x).toMap

}

