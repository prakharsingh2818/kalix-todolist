// Generated by the Scala Plugin for the Protocol Buffer Compiler.
// Do not edit!
//
// Protofile syntax: PROTO3

package kalix

object ViewsProto extends _root_.scalapb.GeneratedFileObject {
  lazy val dependencies: Seq[_root_.scalapb.GeneratedFileObject] = Seq(
    com.google.protobuf.descriptor.DescriptorProtoCompanion
  )
  lazy val messagesCompanions: Seq[_root_.scalapb.GeneratedMessageCompanion[_ <: _root_.scalapb.GeneratedMessage]] =
    Seq[_root_.scalapb.GeneratedMessageCompanion[_ <: _root_.scalapb.GeneratedMessage]](
      kalix.View
    )
  private lazy val ProtoBytes: _root_.scala.Array[Byte] =
      scalapb.Encoding.fromBase64(scala.collection.immutable.Seq(
  """ChFrYWxpeC92aWV3cy5wcm90bxIFa2FsaXgaIGdvb2dsZS9wcm90b2J1Zi9kZXNjcmlwdG9yLnByb3RvIqYDCgRWaWV3EjkKB
  nVwZGF0ZRgBIAEoCzISLmthbGl4LlZpZXcuVXBkYXRlQgviPwgSBnVwZGF0ZUgAUgZ1cGRhdGUSNQoFcXVlcnkYAiABKAsyES5rY
  WxpeC5WaWV3LlF1ZXJ5QgriPwcSBXF1ZXJ5SABSBXF1ZXJ5Gm4KBlVwZGF0ZRIgCgV0YWJsZRgBIAEoCUIK4j8HEgV0YWJsZVIFd
  GFibGUSQgoRdHJhbnNmb3JtX3VwZGF0ZXMYAiABKAhCFeI/EhIQdHJhbnNmb3JtVXBkYXRlc1IQdHJhbnNmb3JtVXBkYXRlcxqoA
  QoFUXVlcnkSIAoFcXVlcnkYAyABKAlCCuI/BxIFcXVlcnlSBXF1ZXJ5EkIKEXRyYW5zZm9ybV9yZXN1bHRzGAQgASgIQhXiPxISE
  HRyYW5zZm9ybVJlc3VsdHNSEHRyYW5zZm9ybVJlc3VsdHMSOQoOc3RyZWFtX3VwZGF0ZXMYBSABKAhCEuI/DxINc3RyZWFtVXBkY
  XRlc1INc3RyZWFtVXBkYXRlc0IRCg91cGRhdGVfb3JfcXVlcnlCRAoFa2FsaXhCClZpZXdzUHJvdG9QAVotZ2l0aHViLmNvbS9sa
  WdodGJlbmQva2FsaXgtZ28tc2RrL2thbGl4O2thbGl4YgZwcm90bzM="""
      ).mkString)
  lazy val scalaDescriptor: _root_.scalapb.descriptors.FileDescriptor = {
    val scalaProto = com.google.protobuf.descriptor.FileDescriptorProto.parseFrom(ProtoBytes)
    _root_.scalapb.descriptors.FileDescriptor.buildFrom(scalaProto, dependencies.map(_.scalaDescriptor))
  }
  lazy val javaDescriptor: com.google.protobuf.Descriptors.FileDescriptor = {
    val javaProto = com.google.protobuf.DescriptorProtos.FileDescriptorProto.parseFrom(ProtoBytes)
    com.google.protobuf.Descriptors.FileDescriptor.buildFrom(javaProto, _root_.scala.Array(
      com.google.protobuf.descriptor.DescriptorProtoCompanion.javaDescriptor
    ))
  }
  @deprecated("Use javaDescriptor instead. In a future version this will refer to scalaDescriptor.", "ScalaPB 0.5.47")
  def descriptor: com.google.protobuf.Descriptors.FileDescriptor = javaDescriptor
}