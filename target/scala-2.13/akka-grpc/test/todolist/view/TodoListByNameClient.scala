
// Generated by Akka gRPC. DO NOT EDIT.
package todolist.view

import scala.concurrent.ExecutionContext

import akka.actor.ClassicActorSystemProvider

import akka.grpc.GrpcClientSettings

import akka.grpc.scaladsl.AkkaGrpcClient

import akka.grpc.internal.NettyClientUtils
import akka.grpc.internal.ClientState

import akka.grpc.AkkaGrpcGenerated

import akka.grpc.scaladsl.SingleResponseRequestBuilder
import akka.grpc.internal.ScalaUnaryRequestBuilder
import akka.grpc.scaladsl.StreamResponseRequestBuilder
import akka.grpc.internal.ScalaServerStreamingRequestBuilder

// Not sealed so users can extend to write their stubs
@AkkaGrpcGenerated
trait TodoListByNameClient extends TodoListByName with TodoListByNameClientPowerApi with AkkaGrpcClient

@AkkaGrpcGenerated
object TodoListByNameClient {
  def apply(settings: GrpcClientSettings)(implicit sys: ClassicActorSystemProvider): TodoListByNameClient =
    new DefaultTodoListByNameClient(settings)
}

@AkkaGrpcGenerated
final class DefaultTodoListByNameClient(settings: GrpcClientSettings)(implicit sys: ClassicActorSystemProvider) extends TodoListByNameClient {
  import TodoListByName.MethodDescriptors._

  private implicit val ex: ExecutionContext = sys.classicSystem.dispatcher
  private val options = NettyClientUtils.callOptions(settings)
  private val clientState = new ClientState(settings, akka.event.Logging(sys.classicSystem, classOf[DefaultTodoListByNameClient]))

  
  private def updateTodoListRequestBuilder(channel: akka.grpc.internal.InternalChannel) =
  
    new ScalaUnaryRequestBuilder(updateTodoListDescriptor, channel, options, settings)
  
  
  private def getTodoListItemsRequestBuilder(channel: akka.grpc.internal.InternalChannel) =
  
    
    new ScalaServerStreamingRequestBuilder(getTodoListItemsDescriptor, channel, options, settings)
    
  
  

  
  /**
   * Lower level "lifted" version of the method, giving access to request metadata etc.
   * prefer updateTodoList(todolist.domain.TodoItemState) if possible.
   */
  
  override def updateTodoList(): SingleResponseRequestBuilder[todolist.domain.TodoItemState, todolist.domain.TodoItemState] =
    updateTodoListRequestBuilder(clientState.internalChannel)
  

  /**
   * For access to method metadata use the parameterless version of updateTodoList
   */
  def updateTodoList(in: todolist.domain.TodoItemState): scala.concurrent.Future[todolist.domain.TodoItemState] =
    updateTodoList().invoke(in)
  
  /**
   * Lower level "lifted" version of the method, giving access to request metadata etc.
   * prefer getTodoListItems(todolist.view.GetByNameRequest) if possible.
   */
  
  override def getTodoListItems(): StreamResponseRequestBuilder[todolist.view.GetByNameRequest, todolist.domain.TodoItemState] =
    getTodoListItemsRequestBuilder(clientState.internalChannel)
  

  /**
   * For access to method metadata use the parameterless version of getTodoListItems
   */
  def getTodoListItems(in: todolist.view.GetByNameRequest): akka.stream.scaladsl.Source[todolist.domain.TodoItemState, akka.NotUsed] =
    getTodoListItems().invoke(in)
  

  override def close(): scala.concurrent.Future[akka.Done] = clientState.close()
  override def closed: scala.concurrent.Future[akka.Done] = clientState.closed()

}

@AkkaGrpcGenerated
object DefaultTodoListByNameClient {

  def apply(settings: GrpcClientSettings)(implicit sys: ClassicActorSystemProvider): TodoListByNameClient =
    new DefaultTodoListByNameClient(settings)
}

@AkkaGrpcGenerated
trait TodoListByNameClientPowerApi {
  
  /**
   * Lower level "lifted" version of the method, giving access to request metadata etc.
   * prefer updateTodoList(todolist.domain.TodoItemState) if possible.
   */
  
  def updateTodoList(): SingleResponseRequestBuilder[todolist.domain.TodoItemState, todolist.domain.TodoItemState] = ???
  
  
  /**
   * Lower level "lifted" version of the method, giving access to request metadata etc.
   * prefer getTodoListItems(todolist.view.GetByNameRequest) if possible.
   */
  
  def getTodoListItems(): StreamResponseRequestBuilder[todolist.view.GetByNameRequest, todolist.domain.TodoItemState] = ???
  
  

}
