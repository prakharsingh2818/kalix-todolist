// Generated by the Scala Plugin for the Protocol Buffer Compiler.
// Do not edit!
//
// Protofile syntax: PROTO3

package com.google.api

object AnnotationsProto extends _root_.scalapb.GeneratedFileObject {
  lazy val dependencies: Seq[_root_.scalapb.GeneratedFileObject] = Seq(
    com.google.api.HttpProto,
    com.google.protobuf.descriptor.DescriptorProtoCompanion
  )
  lazy val messagesCompanions: Seq[_root_.scalapb.GeneratedMessageCompanion[_ <: _root_.scalapb.GeneratedMessage]] = Seq.empty
  private lazy val ProtoBytes: _root_.scala.Array[Byte] =
      scalapb.Encoding.fromBase64(scala.collection.immutable.Seq(
  """Chxnb29nbGUvYXBpL2Fubm90YXRpb25zLnByb3RvEgpnb29nbGUuYXBpGhVnb29nbGUvYXBpL2h0dHAucHJvdG8aIGdvb2dsZ
  S9wcm90b2J1Zi9kZXNjcmlwdG9yLnByb3RvOksKBGh0dHASHi5nb29nbGUucHJvdG9idWYuTWV0aG9kT3B0aW9ucxiwyrwiIAEoC
  zIULmdvb2dsZS5hcGkuSHR0cFJ1bGVSBGh0dHBCgAEKDmNvbS5nb29nbGUuYXBpQhBBbm5vdGF0aW9uc1Byb3RvUAFaQWdvb2dsZ
  S5nb2xhbmcub3JnL2dlbnByb3RvL2dvb2dsZWFwaXMvYXBpL2Fubm90YXRpb25zO2Fubm90YXRpb25zogIER0FQSaoCD0dvb2dsZ
  S5Qcm90b2J1ZmIGcHJvdG8z"""
      ).mkString)
  lazy val scalaDescriptor: _root_.scalapb.descriptors.FileDescriptor = {
    val scalaProto = com.google.protobuf.descriptor.FileDescriptorProto.parseFrom(ProtoBytes)
    _root_.scalapb.descriptors.FileDescriptor.buildFrom(scalaProto, dependencies.map(_.scalaDescriptor))
  }
  lazy val javaDescriptor: com.google.protobuf.Descriptors.FileDescriptor = {
    val javaProto = com.google.protobuf.DescriptorProtos.FileDescriptorProto.parseFrom(ProtoBytes)
    com.google.protobuf.Descriptors.FileDescriptor.buildFrom(javaProto, _root_.scala.Array(
      com.google.api.HttpProto.javaDescriptor,
      com.google.protobuf.descriptor.DescriptorProtoCompanion.javaDescriptor
    ))
  }
  @deprecated("Use javaDescriptor instead. In a future version this will refer to scalaDescriptor.", "ScalaPB 0.5.47")
  def descriptor: com.google.protobuf.Descriptors.FileDescriptor = javaDescriptor
  val http: _root_.scalapb.GeneratedExtension[com.google.protobuf.descriptor.MethodOptions, _root_.scala.Option[com.google.api.HttpRule]] =
    _root_.scalapb.GeneratedExtension.forOptionalUnknownMessageField(72295728, _root_.scalapb.UnknownFieldSet.Field.lengthDelimitedLens)({__valueIn => _root_.scalapb.GeneratedExtension.readMessageFromByteString(com.google.api.HttpRule)(__valueIn)}, {__valueIn => __valueIn.toByteString})
}