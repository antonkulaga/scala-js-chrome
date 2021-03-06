package chrome.tabs.bindings


import chrome.events.bindings.Event
import chrome.runtime.bindings.Port
import chrome.windows.bindings.Window

import scala.scalajs.js
import scala.scalajs.js.annotation.JSName
import scala.scalajs.js.{UndefOr, native, undefined}
import scala.scalajs.js.`|`

@JSName("chrome.tabs")
@js.native
object Tabs extends js.Object {

  val onCreated: Event[js.Function1[Tab, _]] = native
  val onUpdated: Event[js.Function3[Tab.Id, ChangeInfo, Tab, _]] = native
  val onMoved: Event[js.Function2[Tab.Id, MoveInfo, _]] = native
  val onActivated: Event[js.Function1[ActiveInfo, _]] = native
  val onHighlighted: Event[js.Function1[HighlightInfo, _]] = native
  val onDetached: Event[js.Function2[Tab.Id, DetachInfo, _]] = native
  val onAttached: Event[js.Function2[Tab.Id, AttachInfo, _]] = native
  val onRemoved: Event[js.Function2[Tab.Id, RemoveInfo, _]] = native
  val onReplaced: Event[js.Function2[Tab.Id, Tab.Id, _]] = native
  val onZoomChange: Event[js.Function1[ZoomChangeInfo, _]] = native

  def get(tabId: Tab.Id, callback: js.Function1[Tab, _]): Unit = native

  def getCurrent(callback: js.Function1[Tab, _]): Unit = native

  def connect(tabId: Tab.Id, connectInfo: UndefOr[ConnectInfo] = undefined): Port = native

  def sendRequest(tabId: Tab.Id, request: js.Any,
                  responseCallback: UndefOr[js.Function1[js.Any, _]] = undefined): Unit = native

  def sendMessage(tabId: Tab.Id, message: js.Any, options: UndefOr[MessageOptions] = undefined,
                  responseCallback: UndefOr[js.Function1[js.Any, _]] = undefined): Unit = native

  def create(createProperties: TabCreateProperties, callback: UndefOr[js.Function1[Tab, _]] = undefined): Unit = native

  def duplicate(tabId: Tab.Id, callback: UndefOr[js.Function1[UndefOr[Tab], _]] = undefined): Unit = native

  def query(queryInfo: TabQuery, callback: js.Function1[js.Array[Tab], _]): Unit = native

  def highlight(highlightInfo: HighlightInfo, callback: js.Function1[Window, _]): Unit = native

  def update(tabId: UndefOr[Tab.Id] = undefined, updateProperties: UpdateProperties,
             callback: UndefOr[js.Function1[UndefOr[Tab], _]] = undefined): Unit = native

  def move(tabIds: js.Any, moveProperties: MoveProperties,
           callback: UndefOr[js.Function1[Tab | js.Array[Tab], _]] = undefined): Unit = native

  def reload(tabId: UndefOr[Tab.Id] = undefined, reloadProperties: ReloadProperties,
             callback: UndefOr[js.Function0[_]] = undefined): Unit = native

  def remove(tabIds: js.Any, callback: UndefOr[js.Function0[_]] = undefined): Unit = native

  def detectLanguage(tabId: UndefOr[Tab.Id] = undefined, callback: js.Function1[String, _]): Unit = native

  def captureVisibleTab(windowId: UndefOr[Window.Id] = undefined, options: UndefOr[CaptureOptions] = undefined,
                        callback: UndefOr[js.Function1[String, _]] = undefined): Unit = native

  def executeScript(tabId: UndefOr[Tab.Id] = undefined, details: CodeInjectionOptions,
                    callback: UndefOr[js.Function1[UndefOr[js.Array[js.Any]], _]] = undefined): Unit = native

  def insertCSS(tabId: UndefOr[Tab.Id] = undefined, details: CodeInjectionOptions,
                callback: UndefOr[js.Function0[_]] = undefined): Unit = native

  def setZoom(tabId: UndefOr[Tab.Id] = undefined, zoomFactor: Double,
              callback: UndefOr[js.Function0[_]] = undefined): Unit = native

  def getZoom(tabId: UndefOr[Tab.Id] = undefined, callback: js.Function1[Double, _]): Unit = native

  def setZoomSettings(tabId: UndefOr[Tab.Id] = undefined, zoomSettings: ZoomSettings,
                      callback: js.Function0[_]): Unit = native

  def getZoomSettings(tabId: UndefOr[Tab.Id] = undefined, callback: js.Function1[ZoomSettings, _]): Unit = native

}













































