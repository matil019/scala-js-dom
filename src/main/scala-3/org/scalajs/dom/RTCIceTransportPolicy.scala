/** http://www.w3.org/TR/2015/WD-webrtc-20150210/ */
package org.scalajs.dom

import scala.scalajs.js

/** see [[https://www.w3.org/TR/2015/WD-webrtc-20150210/#idl-def-RTCIceTransportPolicy]] in W3C spec */
opaque type RTCIceTransportPolicy <: String = String

object RTCIceTransportPolicy {

  /** The ICE engine must not send or receive any packets at this point. */
  val none: RTCIceTransportPolicy = "none"

  /** The ICE engine must only use media relay candidates such as candidates passing through a TURN server. This can be
    * used to reduce leakage of IP addresses in certain use cases.
    */
  val relay: RTCIceTransportPolicy = "relay"

  /** The ICE engine may use any type of candidates when this value is specified. */
  val all: RTCIceTransportPolicy = "all"
}
