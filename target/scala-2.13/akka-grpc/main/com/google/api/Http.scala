// Generated by the Scala Plugin for the Protocol Buffer Compiler.
// Do not edit!
//
// Protofile syntax: PROTO3

package com.google.api

/** Defines the HTTP configuration for an API service. It contains a list of
  * [HttpRule][google.api.HttpRule], each specifying the mapping of an RPC method
  * to one or more HTTP REST API methods.
  *
  * @param rules
  *   A list of HTTP configuration rules that apply to individual API methods.
  *  
  *   **NOTE:** All service configuration rules follow "last one wins" order.
  * @param fullyDecodeReservedExpansion
  *   When set to true, URL path parameters will be fully URI-decoded except in
  *   cases of single segment matches in reserved expansion, where "%2F" will be
  *   left encoded.
  *  
  *   The default behavior is to not decode RFC 6570 reserved characters in multi
  *   segment matches.
  */
@SerialVersionUID(0L)
final case class Http(
    rules: _root_.scala.Seq[com.google.api.HttpRule] = _root_.scala.Seq.empty,
    fullyDecodeReservedExpansion: _root_.scala.Boolean = false,
    unknownFields: _root_.scalapb.UnknownFieldSet = _root_.scalapb.UnknownFieldSet.empty
    ) extends scalapb.GeneratedMessage with scalapb.lenses.Updatable[Http] {
    @transient
    private[this] var __serializedSizeMemoized: _root_.scala.Int = 0
    private[this] def __computeSerializedSize(): _root_.scala.Int = {
      var __size = 0
      rules.foreach { __item =>
        val __value = __item
        __size += 1 + _root_.com.google.protobuf.CodedOutputStream.computeUInt32SizeNoTag(__value.serializedSize) + __value.serializedSize
      }
      
      {
        val __value = fullyDecodeReservedExpansion
        if (__value != false) {
          __size += _root_.com.google.protobuf.CodedOutputStream.computeBoolSize(2, __value)
        }
      };
      __size += unknownFields.serializedSize
      __size
    }
    override def serializedSize: _root_.scala.Int = {
      var __size = __serializedSizeMemoized
      if (__size == 0) {
        __size = __computeSerializedSize() + 1
        __serializedSizeMemoized = __size
      }
      __size - 1
      
    }
    def writeTo(`_output__`: _root_.com.google.protobuf.CodedOutputStream): _root_.scala.Unit = {
      rules.foreach { __v =>
        val __m = __v
        _output__.writeTag(1, 2)
        _output__.writeUInt32NoTag(__m.serializedSize)
        __m.writeTo(_output__)
      };
      {
        val __v = fullyDecodeReservedExpansion
        if (__v != false) {
          _output__.writeBool(2, __v)
        }
      };
      unknownFields.writeTo(_output__)
    }
    def clearRules = copy(rules = _root_.scala.Seq.empty)
    def addRules(__vs: com.google.api.HttpRule *): Http = addAllRules(__vs)
    def addAllRules(__vs: Iterable[com.google.api.HttpRule]): Http = copy(rules = rules ++ __vs)
    def withRules(__v: _root_.scala.Seq[com.google.api.HttpRule]): Http = copy(rules = __v)
    def withFullyDecodeReservedExpansion(__v: _root_.scala.Boolean): Http = copy(fullyDecodeReservedExpansion = __v)
    def withUnknownFields(__v: _root_.scalapb.UnknownFieldSet) = copy(unknownFields = __v)
    def discardUnknownFields = copy(unknownFields = _root_.scalapb.UnknownFieldSet.empty)
    def getFieldByNumber(__fieldNumber: _root_.scala.Int): _root_.scala.Any = {
      (__fieldNumber: @_root_.scala.unchecked) match {
        case 1 => rules
        case 2 => {
          val __t = fullyDecodeReservedExpansion
          if (__t != false) __t else null
        }
      }
    }
    def getField(__field: _root_.scalapb.descriptors.FieldDescriptor): _root_.scalapb.descriptors.PValue = {
      _root_.scala.Predef.require(__field.containingMessage eq companion.scalaDescriptor)
      (__field.number: @_root_.scala.unchecked) match {
        case 1 => _root_.scalapb.descriptors.PRepeated(rules.iterator.map(_.toPMessage).toVector)
        case 2 => _root_.scalapb.descriptors.PBoolean(fullyDecodeReservedExpansion)
      }
    }
    def toProtoString: _root_.scala.Predef.String = _root_.scalapb.TextFormat.printToUnicodeString(this)
    def companion: com.google.api.Http.type = com.google.api.Http
    // @@protoc_insertion_point(GeneratedMessage[google.api.Http])
}

object Http extends scalapb.GeneratedMessageCompanion[com.google.api.Http] {
  implicit def messageCompanion: scalapb.GeneratedMessageCompanion[com.google.api.Http] = this
  def parseFrom(`_input__`: _root_.com.google.protobuf.CodedInputStream): com.google.api.Http = {
    val __rules: _root_.scala.collection.immutable.VectorBuilder[com.google.api.HttpRule] = new _root_.scala.collection.immutable.VectorBuilder[com.google.api.HttpRule]
    var __fullyDecodeReservedExpansion: _root_.scala.Boolean = false
    var `_unknownFields__`: _root_.scalapb.UnknownFieldSet.Builder = null
    var _done__ = false
    while (!_done__) {
      val _tag__ = _input__.readTag()
      _tag__ match {
        case 0 => _done__ = true
        case 10 =>
          __rules += _root_.scalapb.LiteParser.readMessage[com.google.api.HttpRule](_input__)
        case 16 =>
          __fullyDecodeReservedExpansion = _input__.readBool()
        case tag =>
          if (_unknownFields__ == null) {
            _unknownFields__ = new _root_.scalapb.UnknownFieldSet.Builder()
          }
          _unknownFields__.parseField(tag, _input__)
      }
    }
    com.google.api.Http(
        rules = __rules.result(),
        fullyDecodeReservedExpansion = __fullyDecodeReservedExpansion,
        unknownFields = if (_unknownFields__ == null) _root_.scalapb.UnknownFieldSet.empty else _unknownFields__.result()
    )
  }
  implicit def messageReads: _root_.scalapb.descriptors.Reads[com.google.api.Http] = _root_.scalapb.descriptors.Reads{
    case _root_.scalapb.descriptors.PMessage(__fieldsMap) =>
      _root_.scala.Predef.require(__fieldsMap.keys.forall(_.containingMessage eq scalaDescriptor), "FieldDescriptor does not match message type.")
      com.google.api.Http(
        rules = __fieldsMap.get(scalaDescriptor.findFieldByNumber(1).get).map(_.as[_root_.scala.Seq[com.google.api.HttpRule]]).getOrElse(_root_.scala.Seq.empty),
        fullyDecodeReservedExpansion = __fieldsMap.get(scalaDescriptor.findFieldByNumber(2).get).map(_.as[_root_.scala.Boolean]).getOrElse(false)
      )
    case _ => throw new RuntimeException("Expected PMessage")
  }
  def javaDescriptor: _root_.com.google.protobuf.Descriptors.Descriptor = HttpProto.javaDescriptor.getMessageTypes().get(0)
  def scalaDescriptor: _root_.scalapb.descriptors.Descriptor = HttpProto.scalaDescriptor.messages(0)
  def messageCompanionForFieldNumber(__number: _root_.scala.Int): _root_.scalapb.GeneratedMessageCompanion[_] = {
    var __out: _root_.scalapb.GeneratedMessageCompanion[_] = null
    (__number: @_root_.scala.unchecked) match {
      case 1 => __out = com.google.api.HttpRule
    }
    __out
  }
  lazy val nestedMessagesCompanions: Seq[_root_.scalapb.GeneratedMessageCompanion[_ <: _root_.scalapb.GeneratedMessage]] = Seq.empty
  def enumCompanionForFieldNumber(__fieldNumber: _root_.scala.Int): _root_.scalapb.GeneratedEnumCompanion[_] = throw new MatchError(__fieldNumber)
  lazy val defaultInstance = com.google.api.Http(
    rules = _root_.scala.Seq.empty,
    fullyDecodeReservedExpansion = false
  )
  implicit class HttpLens[UpperPB](_l: _root_.scalapb.lenses.Lens[UpperPB, com.google.api.Http]) extends _root_.scalapb.lenses.ObjectLens[UpperPB, com.google.api.Http](_l) {
    def rules: _root_.scalapb.lenses.Lens[UpperPB, _root_.scala.Seq[com.google.api.HttpRule]] = field(_.rules)((c_, f_) => c_.copy(rules = f_))
    def fullyDecodeReservedExpansion: _root_.scalapb.lenses.Lens[UpperPB, _root_.scala.Boolean] = field(_.fullyDecodeReservedExpansion)((c_, f_) => c_.copy(fullyDecodeReservedExpansion = f_))
  }
  final val RULES_FIELD_NUMBER = 1
  final val FULLY_DECODE_RESERVED_EXPANSION_FIELD_NUMBER = 2
  def of(
    rules: _root_.scala.Seq[com.google.api.HttpRule],
    fullyDecodeReservedExpansion: _root_.scala.Boolean
  ): _root_.com.google.api.Http = _root_.com.google.api.Http(
    rules,
    fullyDecodeReservedExpansion
  )
  // @@protoc_insertion_point(GeneratedMessageCompanion[google.api.Http])
}