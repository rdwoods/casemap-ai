-if class com.casemapai.data.response.OpenAiResponseDto
-keepnames class com.casemapai.data.response.OpenAiResponseDto
-if class com.casemapai.data.response.OpenAiResponseDto
-keep class com.casemapai.data.response.OpenAiResponseDtoJsonAdapter {
    public <init>(com.squareup.moshi.Moshi);
}
-if class com.casemapai.data.response.OpenAiResponseDto
-keepnames class kotlin.jvm.internal.DefaultConstructorMarker
-if class com.casemapai.data.response.OpenAiResponseDto
-keepclassmembers class com.casemapai.data.response.OpenAiResponseDto {
    public synthetic <init>(java.lang.String,java.util.List,java.lang.String,int,kotlin.jvm.internal.DefaultConstructorMarker);
}
