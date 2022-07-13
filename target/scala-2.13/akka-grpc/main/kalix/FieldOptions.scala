// Generated by the Scala Plugin for the Protocol Buffer Compiler.
// Do not edit!
//
// Protofile syntax: PROTO3

package kalix

/** @param entityKey
  *   Extension for specifying which field in a message is to be considered an
  *   entity key, for the purposes of associating gRPC calls with entities and
  *   sharding.
  * @param jwt
  *   JWT claim and token configuration.
  */
@SerialVersionUID(0L)
final case class FieldOptions(
    entityKey: _root_.scala.Boolean = false,
    jwt: _root_.scala.Option[kalix.JwtFieldOptions] = _root_.scala.None,
    unknownFields: _root_.scalapb.UnknownFieldSet = _root_.scalapb.UnknownFieldSet.empty
    ) extends scalapb.GeneratedMessage with scalapb.lenses.Updatable[FieldOptions] {
    @transient
    private[this] var __serializedSizeMemoized: _root_.scala.Int = 0
    private[this] def __computeSerializedSize(): _root_.scala.Int = {
      var __size = 0
      
      {
        val __value = entityKey
        if (__value != false) {
          __size += _root_.com.google.protobuf.CodedOutputStream.computeBoolSize(1, __value)
        }
      };
      if (jwt.isDefined) {
        val __value = jwt.get
        __size += 1 + _root_.com.google.protobuf.CodedOutputStream.computeUInt32SizeNoTag(__value.serializedSize) + __value.serializedSize
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
      {
        val __v = entityKey
        if (__v != false) {
          _output__.writeBool(1, __v)
        }
      };
      jwt.foreach { __v =>
        val __m = __v
        _output__.writeTag(2, 2)
        _output__.writeUInt32NoTag(__m.serializedSize)
        __m.writeTo(_output__)
      };
      unknownFields.writeTo(_output__)
    }
    def withEntityKey(__v: _root_.scala.Boolean): FieldOptions = copy(entityKey = __v)
    def getJwt: kalix.JwtFieldOptions = jwt.getOrElse(kalix.JwtFieldOptions.defaultInstance)
    def clearJwt: FieldOptions = copy(jwt = _root_.scala.None)
    def withJwt(__v: kalix.JwtFieldOptions): FieldOptions = copy(jwt = Option(__v))
    def withUnknownFields(__v: _root_.scalapb.UnknownFieldSet) = copy(unknownFields = __v)
    def discardUnknownFields = copy(unknownFields = _root_.scalapb.UnknownFieldSet.empty)
    def getFieldByNumber(__fieldNumber: _root_.scala.Int): _root_.scala.Any = {
      (__fieldNumber: @_root_.scala.unchecked) match {
        case 1 => {
          val __t = entityKey
          if (__t != false) __t else null
        }
        case 2 => jwt.orNull
      }
    }
    def getField(__field: _root_.scalapb.descriptors.FieldDescriptor): _root_.scalapb.descriptors.PValue = {
      _root_.scala.Predef.require(__field.containingMessage eq companion.scalaDescriptor)
      (__field.number: @_root_.scala.unchecked) match {
        case 1 => _root_.scalapb.descriptors.PBoolean(entityKey)
        case 2 => jwt.map(_.toPMessage).getOrElse(_root_.scalapb.descriptors.PEmpty)
      }
    }
    def toProtoString: _root_.scala.Predef.String = _root_.scalapb.TextFormat.printToUnicodeString(this)
    def companion: kalix.FieldOptions.type = kalix.FieldOptions
    // @@protoc_insertion_point(GeneratedMessage[kalix.FieldOptions])
}

object FieldOptions extends scalapb.GeneratedMessageCompanion[kalix.FieldOptions] {
  implicit def messageCompanion: scalapb.GeneratedMessageCompanion[kalix.FieldOptions] = this
  def parseFrom(`_input__`: _root_.com.google.protobuf.CodedInputStream): kalix.FieldOptions = {
    var __entityKey: _root_.scala.Boolean = false
    var __jwt: _root_.scala.Option[kalix.JwtFieldOptions] = _root_.scala.None
    var `_unknownFields__`: _root_.scalapb.UnknownFieldSet.Builder = null
    var _done__ = false
    while (!_done__) {
      val _tag__ = _input__.readTag()
      _tag__ match {
        case 0 => _done__ = true
        case 8 =>
          __entityKey = _input__.readBool()
        case 18 =>
          __jwt = Option(__jwt.fold(_root_.scalapb.LiteParser.readMessage[kalix.JwtFieldOptions](_input__))(_root_.scalapb.LiteParser.readMessage(_input__, _)))
        case tag =>
          if (_unknownFields__ == null) {
            _unknownFields__ = new _root_.scalapb.UnknownFieldSet.Builder()
          }
          _unknownFields__.parseField(tag, _input__)
      }
    }
    kalix.FieldOptions(
        entityKey = __entityKey,
        jwt = __jwt,
        unknownFields = if (_unknownFields__ == null) _root_.scalapb.UnknownFieldSet.empty else _unknownFields__.result()
    )
  }
  implicit def messageReads: _root_.scalapb.descriptors.Reads[kalix.FieldOptions] = _root_.scalapb.descriptors.Reads{
    case _root_.scalapb.descriptors.PMessage(__fieldsMap) =>
      _root_.scala.Predef.require(__fieldsMap.keys.forall(_.containingMessage eq scalaDescriptor), "FieldDescriptor does not match message type.")
      kalix.FieldOptions(
        entityKey = __fieldsMap.get(scalaDescriptor.findFieldByNumber(1).get).map(_.as[_root_.scala.Boolean]).getOrElse(false),
        jwt = __fieldsMap.get(scalaDescriptor.findFieldByNumber(2).get).flatMap(_.as[_root_.scala.Option[kalix.JwtFieldOptions]])
      )
    case _ => throw new RuntimeException("Expected PMessage")
  }
  def javaDescriptor: _root_.com.google.protobuf.Descriptors.Descriptor = AnnotationsProto.javaDescriptor.getMessageTypes().get(0)
  def scalaDescriptor: _root_.scalapb.descriptors.Descriptor = AnnotationsProto.scalaDescriptor.messages(0)
  def messageCompanionForFieldNumber(__number: _root_.scala.Int): _root_.scalapb.GeneratedMessageCompanion[_] = {
    var __out: _root_.scalapb.GeneratedMessageCompanion[_] = null
    (__number: @_root_.scala.unchecked) match {
      case 2 => __out = kalix.JwtFieldOptions
    }
    __out
  }
  lazy val nestedMessagesCompanions: Seq[_root_.scalapb.GeneratedMessageCompanion[_ <: _root_.scalapb.GeneratedMessage]] = Seq.empty
  def enumCompanionForFieldNumber(__fieldNumber: _root_.scala.Int): _root_.scalapb.GeneratedEnumCompanion[_] = throw new MatchError(__fieldNumber)
  lazy val defaultInstance = kalix.FieldOptions(
    entityKey = false,
    jwt = _root_.scala.None
  )
  implicit class FieldOptionsLens[UpperPB](_l: _root_.scalapb.lenses.Lens[UpperPB, kalix.FieldOptions]) extends _root_.scalapb.lenses.ObjectLens[UpperPB, kalix.FieldOptions](_l) {
    def entityKey: _root_.scalapb.lenses.Lens[UpperPB, _root_.scala.Boolean] = field(_.entityKey)((c_, f_) => c_.copy(entityKey = f_))
    def jwt: _root_.scalapb.lenses.Lens[UpperPB, kalix.JwtFieldOptions] = field(_.getJwt)((c_, f_) => c_.copy(jwt = Option(f_)))
    def optionalJwt: _root_.scalapb.lenses.Lens[UpperPB, _root_.scala.Option[kalix.JwtFieldOptions]] = field(_.jwt)((c_, f_) => c_.copy(jwt = f_))
  }
  final val ENTITY_KEY_FIELD_NUMBER = 1
  final val JWT_FIELD_NUMBER = 2
  def of(
    entityKey: _root_.scala.Boolean,
    jwt: _root_.scala.Option[kalix.JwtFieldOptions]
  ): _root_.kalix.FieldOptions = _root_.kalix.FieldOptions(
    entityKey,
    jwt
  )
  // @@protoc_insertion_point(GeneratedMessageCompanion[kalix.FieldOptions])
}
